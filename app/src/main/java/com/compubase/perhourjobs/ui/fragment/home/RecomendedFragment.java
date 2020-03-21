package com.compubase.perhourjobs.ui.fragment.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.compubase.perhourjobs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecomendedFragment extends Fragment {


    public RecomendedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recomended, container, false);
    }

}
