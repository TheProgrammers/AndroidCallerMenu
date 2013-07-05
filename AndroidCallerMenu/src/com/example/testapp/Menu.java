package com.example.testapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Menu extends ListActivity{
	String users[] = { "Misho", "Misho", "Stefan", "Gosho" };
	public static String currentName;
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		 currentName = users[position];

		try {
			Class createClass = Class.forName("com.example.testapp." + currentName);
			Intent nextScreen = new Intent(Menu.this, createClass);
			startActivity(nextScreen);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, users));
		
	}
}
