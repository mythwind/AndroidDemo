package com.vincent.myth.androiddemo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vincent.myth.androiddemo.R;

/**
 * A fragment with a Google +1 button.
 */
public class MeFragment extends BaseFragment implements View.OnClickListener {

    public MeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        registerListener(view);
        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParams();
    }
    private void initParams() {

    }
    private void registerListener(View view) {
        view.findViewById(R.id.ll_user_works).setOnClickListener(this);
        view.findViewById(R.id.ll_user_income).setOnClickListener(this);
        view.findViewById(R.id.ll_user_collection).setOnClickListener(this);
        view.findViewById(R.id.ll_user_locker).setOnClickListener(this);
        view.findViewById(R.id.ll_user_settings).setOnClickListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_user_works:

                break;
            case R.id.ll_user_income:

                break;
            case R.id.ll_user_collection:
                break;
            case R.id.ll_user_locker:

                break;
            case R.id.ll_user_settings:

                break;
        }
    }
}
