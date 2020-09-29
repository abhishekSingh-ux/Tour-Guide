package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private String tabTitles[]=new String[]{"Top Attractions", "Restaurants", "Historical Sites", "Events"};

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new AttractionsFragment();
        }
        else if(position==1){
            return new RestaurantsFragment();
        }
        else if(position==2){
            return new SitesFragment();
        }
        else{
            return new EventsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
