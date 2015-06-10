package in.srain.cube.demo.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import in.srain.cube.demo.R;
import in.srain.cube.demo.app.CubeDemoApplication;
import in.srain.cube.demo.ui.fragment.TestFragment;
import in.srain.cube.util.CLog;
import in.srain.cube.views.pager.TabPageIndicator;

public class PagerTabIndicatorActivity extends FragmentActivity {
    private static final String[] CONTENT = new String[]{"Recent", "Artists", "Albums", "Songs", "Playlists", "Genres"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        FragmentPagerAdapter adapter = new GoogleMusicAdapter(getSupportFragmentManager());

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.indicator);
        indicator.setViewHolderCreator(new TabPageIndicator.ViewHolderCreator() {
            @Override
            public TabPageIndicator.ViewHolderBase createViewHolder() {
                return new DemoViewHolder();
            }
        });
        indicator.setViewPager(pager, CONTENT.length - 1);
    }

    class GoogleMusicAdapter extends FragmentPagerAdapter {
        public GoogleMusicAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            CLog.d("test", "getItem:%s", position);
            Fragment fragment = TestFragment.newInstance(CONTENT[position % CONTENT.length]);
            return fragment;
        }

        @Override
        public int getCount() {
            return CONTENT.length;
        }
    }

    private class DemoViewHolder extends TabPageIndicator.ViewHolderBase {

        private TextView mTitleTextView;
        private View mViewSelected;
        private final int COLOR_TEXT_SELECTED = Color.parseColor("#ffffff");
        private final int COLOR_TEXT_NORMAL = Color.parseColor("#999999");

        @Override
        public View createView(LayoutInflater layoutInflater, int position) {
            View view = layoutInflater.inflate(R.layout.ht_views_bimai_cat_item, null);
            mTitleTextView = (TextView) view.findViewById(R.id.tv_ht_bimai_cat_item_title);
            mViewSelected = view.findViewById(R.id.tv_ht_bimai_cat_item_selected);
            return view;
        }

        @Override
        public void updateView(int position, boolean isCurrent) {
            mTitleTextView.setText(CONTENT[position]);
            if (isCurrent) {
                mTitleTextView.setTextColor(COLOR_TEXT_SELECTED);
                mViewSelected.setVisibility(View.VISIBLE);
            } else {
                mTitleTextView.setTextColor(COLOR_TEXT_NORMAL);
                mViewSelected.setVisibility(View.INVISIBLE);
            }
        }
    }
}
