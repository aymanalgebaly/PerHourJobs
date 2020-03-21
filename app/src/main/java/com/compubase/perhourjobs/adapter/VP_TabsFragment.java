package com.compubase.perhourjobs.adapter;


import android.content.SharedPreferences;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.compubase.perhourjobs.R;
import com.compubase.perhourjobs.ui.activity.HomeActivity;
import com.compubase.perhourjobs.ui.fragment.home.AllJobsFragment;
import com.compubase.perhourjobs.ui.fragment.home.NearByFragment;
import com.compubase.perhourjobs.ui.fragment.home.RecomendedFragment;


public class VP_TabsFragment extends FragmentPagerAdapter {

    Fragment[] fragments ={new AllJobsFragment(),new NearByFragment(),new RecomendedFragment()};

    String title;

    HomeActivity context;
    private String lan;
    private SharedPreferences preferences;

    public VP_TabsFragment(FragmentManager fm, HomeActivity homeActivity) {

        super(fm);

        this.context = homeActivity;

    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                title = "All jobs";
//                title = context.getResources().getString(R.string.Previous_Reservations);
                break;
            case 1:
                title = "Near By";
//                title = context.getResources().getString(R.string.current_reservation);
                break;

                case 2:
                title = "Recommended";
//                title = context.getResources().getString(R.string.current_reservation);
                break;

        }
        return title;
    }
}
