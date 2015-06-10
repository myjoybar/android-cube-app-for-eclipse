package in.srain.cube.demo.datamodel;

import in.srain.cube.demo.event.ImageListDataEvent;
import in.srain.cube.demo.data.ImageListItem;
import in.srain.cube.demo.request.API;
import in.srain.cube.request.*;
import in.srain.cube.util.CLog;

import java.util.ArrayList;

/**
 * When requesting data from web API, it is a good practice to encapsulate all the request logic in a module.
 * This class has some methods to show how to encapsulate the web request.
 * Every method can take some parameters which are related to the specific business logic, and a
 * callback which will be applied after the request is finished.
 *
 * @author http://www.liaohuqiu.net
 */
public class DemoRevertDataModel {

    /**
     * Demo for using {@link SimpleRequest}
     */
    public static void reverse(final String str, final RequestJsonHandler handler) {

        RequestHandler<JsonData> requestHandler = new RequestHandler<JsonData>() {
            @Override
            public JsonData processOriginData(JsonData jsonData) {
                return jsonData;
            }

            @Override
            public void onRequestFail(FailData failData) {
                CLog.d("demo-request", "onRequestFail");
            }

            @Override
            public void onRequestFinish(JsonData data) {
                CLog.d("demo-request", "onRequestFinish: %s", data);
                handler.onRequestFinish(data);
            }
        };

        SimpleRequest<JsonData> request = new SimpleRequest<JsonData>(requestHandler);
        RequestData requestData = request.getRequestData();
        requestData.setRequestUrl(API.API_REVERT);
        requestData.addQueryData("str", str);

        request.send();
    }

    public static void getImageList(final ImageListDataHandler handler) {
        getImageList(handler, 0, 7, false);
    }

    public static void getImageList(final ImageListDataHandler handler, int start, int num, boolean nocache) {

        CacheAbleRequestHandler requestHandler = new CacheAbleRequestHandler<ImageListDataEvent>() {
            @Override
            public void onCacheData(ImageListDataEvent data, boolean outOfDate) {
                CLog.d("demo-request", "data has been loaded form cache, out of date: %s", outOfDate);
            }

            @Override
            public void onCacheAbleRequestFinish(ImageListDataEvent data, CacheAbleRequest.ResultType type, boolean outOfDate) {

                CLog.d("demo-request",
                        "onData: result type: %s, out of date: %s", type, outOfDate);

                handler.onData(data, type, outOfDate);
            }

            @Override
            public ImageListDataEvent processOriginData(JsonData jsonData) {
                JsonData data = jsonData.optJson("data");
                ArrayList<JsonData> rawList = data.optJson("list").toArrayList();

                ArrayList<ImageListItem> imageList = new ArrayList<ImageListItem>();
                for (int i = 0; i < rawList.size(); i++) {
                    ImageListItem item = new ImageListItem(rawList.get(i));
                    imageList.add(item);
                }

                ImageListDataEvent imageListDataEvent = new ImageListDataEvent();
                imageListDataEvent.imageList = imageList;
                imageListDataEvent.hasMore = data.optBoolean("has_more");
                return imageListDataEvent;
            }

            @Override
            public void onRequestFail(FailData requestResultType) {
                CLog.d("demo-request", "onRequestFail");
            }

            @Override
            public void onRequestFinish(ImageListDataEvent data) {
                CLog.d("demo-request", "onRequestFinish");
            }
        };

        CacheAbleRequest<JsonData> request = new CacheAbleRequest<JsonData>(requestHandler);

        String cacheKey = String.format("image-list-%s-%s", start, num);
        String url = API.API_IMAGE_LIST;
        RequestData requestData = request.getRequestData();
        requestData.setRequestUrl(url);
        requestData.addQueryData("start", start);
        requestData.addQueryData("num", num);

        request.setAssertInitDataPath("request_init/demo/image-list.json");
        request.setCacheKey(cacheKey);

        // Uncomment following line to use the data from cache when cache is available
        // no matter whether it is expired or not.
        // request.setUseCacheAnyway(true);

        // When cache is available and request time has exceeded the timeout time,
        // cache data will be used.
        // request.setTimeout(1000);
        request.send();
    }

    /**
     * customized callback, notified when data loaded
     */
    public static interface ImageListDataHandler {
        public void onData(ImageListDataEvent data, CacheAbleRequest.ResultType type, boolean outOfDate);
    }
}
