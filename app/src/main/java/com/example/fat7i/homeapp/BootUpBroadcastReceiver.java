package com.example.fat7i.homeapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/**
 * Created by Fat7i on 7/27/2018.
 */


public class BootUpBroadcastReceiver extends BroadcastReceiver {

    public final static String TAG = "BootUpBroadcastReceiver";


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "BootUpBroadcastReceiver called!");

        Util.showNotification(context);

    }
}