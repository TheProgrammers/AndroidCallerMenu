package com.example.testapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Menu extends ListActivity{
	//String users[][] = new String[][]{ {"Misho", "0885001010" }, {"Misho", "0885001010" },
	//		{ "Stefan", "0885001010" }, { "Gosho", "0885001010"}  };
	String users[] =  {"Misho", "Misho",
			 "Stefan",  "Gosho",};
	String phones[] = {"05551231", "331131312", "444422112", "1234567898"};
	public static String currentName;
	public static String phoneNumber;
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		currentName = users[position];
		phoneNumber = phones[position];
		// currentName = users[position][0];
		// phoneNumber = users[position][1];
		try {
			Class createClass = Class.forName("com.example.testapp.Call");
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

