package edu.quinnipiac.ser210.tabbed_view;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int numTabs;
    Context context;
    public TabsAdapter(FragmentManager fm, int numTabs, Context context) {
        super(fm);
        this.numTabs = numTabs;
        this.context = context;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragment home = new HomeFragment();
                return home;
            case 1:
                AboutFragment about = new AboutFragment();
                return about;
            case 2:
                ContactFragment contact = new ContactFragment();
                return contact;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.home_tab);
            case 1:
                return context.getResources().getString(R.string.about_tab);
            case 2:
                return context.getResources().getString(R.string.contact_tab);
           }
        return null;
    }
}
