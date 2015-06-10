package in.srain.cube.demo.ui.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import in.srain.cube.demo.R;
import in.srain.cube.demo.datamodel.CacheAbleRequestData;
import in.srain.cube.demo.event.DemoSimpleEventHandler;
import in.srain.cube.demo.event.EventCenter;
import in.srain.cube.demo.event.MsgDataEvent;
import in.srain.cube.mints.base.TitleBaseFragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CacheAbleRequestDemoFragment extends TitleBaseFragment {

    private TextView mTextView;

    private ScrollView mScrollView;

    @Override
    protected View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHeaderTitle(R.string.cube_demo_request_cache_able_request);
        View view = inflater.inflate(R.layout.fragment_request_cache, null);

        mTextView = (TextView) view.findViewById(R.id.request_cache_demo_text_view);
        mScrollView = (ScrollView) view.findViewById(R.id.request_cache_demo_scroll_view);

        EventCenter.bindContainerAndHandler(this, new DemoSimpleEventHandler() {

            public void onEvent(final MsgDataEvent dataEvent) {
                mTextView.post(new Runnable() {
                    @Override
                    public void run() {
                        appendMsg(dataEvent.msg);
                    }
                });
            }
        }).tryToRegisterIfNot();

        TextView textView = (TextView) view.findViewById(R.id.request_cache_demo_btn_use_cache_anyway);
        textView.setText(R.string.cube_demo_cache_manager_clear_cache);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CacheAbleRequestData.getImage(true, false);
            }
        });

        view.findViewById(R.id.request_cache_demo_btn_with_cache).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CacheAbleRequestData.getImage(false, false);
            }
        });

        view.findViewById(R.id.request_cache_demo_btn_no_cache).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CacheAbleRequestData.getImage(false, true);
            }
        });

        view.findViewById(R.id.request_cache_demo_btn_clear_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearMsg();
            }
        });

        return view;
    }

    private void clearMsg() {
        mTextView.setText("");
    }

    private void appendMsg(String msg) {
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        msg = String.format("%s: %s\n", time, msg);
        mTextView.append(msg);
        mScrollView.post(new Runnable() {
            @Override
            public void run() {
                mScrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }
}