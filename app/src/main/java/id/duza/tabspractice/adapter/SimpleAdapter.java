package id.duza.tabspractice.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import id.duza.tabspractice.fragment.Dua;
import id.duza.tabspractice.fragment.Satu;
import id.duza.tabspractice.fragment.Tiga;

/**
 * Created by duza on 18/09/16.
 */
public class SimpleAdapter extends FragmentPagerAdapter {

    private String[] tabsTitle = new String[]{"Satu", "Dua", "Tiga"};
    private Context context;

    public SimpleAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)   {
            case 0:
                return new Satu();
            case 1:
                return new Dua();
            case 2:
                return new Tiga();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabsTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsTitle[position];
    }
}
