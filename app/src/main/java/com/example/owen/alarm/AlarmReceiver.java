package com.example.owen.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by owen on 2015/12/2.
 */
public class AlarmReceiver extends BroadcastReceiver{

    public  void  onReceive(Context context, Intent intent){
        Toast.makeText(context, "時間到", Toast.LENGTH_LONG).show();
        Log.i("AlarmReceiver", "Catch a Message!");
    }
}
