package com.vincent.myth.androiddemo.utils;

import android.util.Log;

/**
 * Created by Admin on 2015/12/29.
 */
public class MyLog {
    private static final boolean DEBUG = true;
    private static final String TAG = "wangss";
    private static final String TAG_PRIFIX = "wangss------->";

    public static final void e(String msg) {
        if (DEBUG) {
            Log.e(TAG, TAG_PRIFIX + msg);
        }
    }
    public static final void i(String msg) {
        if (DEBUG) {
            Log.i(TAG, TAG_PRIFIX + msg);
        }
    }
}
