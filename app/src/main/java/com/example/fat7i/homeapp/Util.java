package com.example.fat7i.homeapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

/**
 * Created by Fat7i on 8/6/2019.
 */

public class Util {

    public static void showNotification(Context context) {

        int mNotificationId = 001;

        // Build Notification , setOngoing keeps the notification always in status bar
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context , context.getString(R.string.notification_channel_id))
                        .setSmallIcon(R.drawable.ic_home)
                        .setContentTitle(context.getString(R.string.home_screen))
                        .setContentText(context.getString(R.string.go_to_home_screen))
                        .setOngoing(true);


        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Create pending intent, mention the Activity which needs to be
        //triggered when user clicks on notification(StopScript.class in this case)
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                startMain, PendingIntent.FLAG_UPDATE_CURRENT);

        mBuilder.setContentIntent(contentIntent);

        // Gets an instance of the NotificationManager service
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        // Builds the notification and issues it.
        mNotificationManager.notify(mNotificationId, mBuilder.build());

    }
}
