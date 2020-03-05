package com.tatacommunications.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "LogUtil";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
