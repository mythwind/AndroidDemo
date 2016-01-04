package com.vincent.myth.androiddemo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vincent.myth.androiddemo.R;

/**
 * A fragment with a Google +1 button.
 */
public class SquareFragment extends BaseFragment {

    public SquareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_square, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }


}
