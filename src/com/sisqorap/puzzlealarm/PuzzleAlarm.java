package com.sisqorap.puzzlealarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PuzzleAlarm extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, OnetimeAlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, REQUEST_CODE, intent, 0);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), sender);
        Toast.makeText(this, "Alarm set", Toast.LENGTH_LONG).show();
        setContentView(R.layout.main);
    }
    
    
}
public class OnetimeAlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
	Toast.makeText(context, "Alarm worked.", Toast.LENGTH_LONG).show();
	}
	}
public class RepeatingAlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
	Toast.makeText(context, "Repeating Alarm worked.", Toast.LENGTH_LONG).show();
	}
	}
