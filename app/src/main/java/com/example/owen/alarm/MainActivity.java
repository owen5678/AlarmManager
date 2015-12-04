package com.example.owen.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar cal =Calendar.getInstance();
            cal.add(Calendar.MINUTE, 1);
            Intent intent =new Intent(this, AlarmReceiver.class);
            AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            //FLAG_ONE_SHOT be used only once
            PendingIntent pi = PendingIntent.getBroadcast(this ,1 ,intent ,PendingIntent.FLAG_ONE_SHOT);
            //RTC_WAKEUP will wake up the device when it goes off.
            //RTC
            am.set(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),pi);
    }
}
