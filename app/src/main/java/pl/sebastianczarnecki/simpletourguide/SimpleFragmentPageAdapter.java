package pl.sebastianczarnecki.simpletourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPageAdapter(Context context, FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new MainListFragment();
        } else if (position == 1) {
            return new NorthFragment();
        } else if (position == 2){
            return new SouthFragment();
        } else {
            return new EastFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_start);
        } else if (position == 1) {
            return context.getString(R.string.category_northtour);
        } else if (position == 2) {
            return context.getString(R.string.category_southtour);
        } else {
            return context.getString(R.string.category_easttour);
        }
    }
}