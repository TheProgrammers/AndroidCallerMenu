package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.testapp.Menu;

public class Misho extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.call);
		TextView toCallId = (TextView) findViewById(R.id.caller);
		String callerId = Menu.currentName;
		toCallId.setText(callerId);
		
	}

}
