package com.compubase.perhourjobs.ui.fragment.home;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.compubase.perhourjobs.R;
import com.compubase.perhourjobs.adapter.VP_TabsFragment;
import com.compubase.perhourjobs.ui.activity.HomeActivity;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    private VP_TabsFragment vp_tabsFragment;
    private HomeActivity homeActivity;
    private SharedPreferences preferences;
    Unbinder unbinder;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        unbinder = ButterKnife.bind(this, view);

        homeActivity = (HomeActivity) getActivity();

        preferences = homeActivity.getSharedPreferences("user", Context.MODE_PRIVATE);

        tabs.setupWithViewPager(viewpager);

        vp_tabsFragment = new VP_TabsFragment(getChildFragmentManager(), homeActivity);
        viewpager.setAdapter(vp_tabsFragment);

        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
