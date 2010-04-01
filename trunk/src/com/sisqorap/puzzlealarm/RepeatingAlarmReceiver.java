package com.sisqorap.puzzlealarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RepeatingAlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
	Toast.makeText(context, "Repeating Alarm worked.", Toast.LENGTH_LONG).show();
	}
}
