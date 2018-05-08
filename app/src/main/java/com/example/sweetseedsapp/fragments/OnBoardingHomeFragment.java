package com.example.sweetseedsapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sweetseedsapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnBoardingHomeFragment extends Fragment {

    ImageView ob_home_image;

    public OnBoardingHomeFragment() {
        // Required empty public constructor
    }

    public static OnBoardingHomeFragment newInstance(){
        return new OnBoardingHomeFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_on_boarding_home, container, false);
        ob_home_image = rootView.findViewById(R.id.ob_home_image);

        return rootView;
    }

}
