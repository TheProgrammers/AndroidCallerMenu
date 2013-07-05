package com.example.testapp;

import com.example.testapp.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer song = new MediaPlayer();
	@Override
	protected void onCreate(Bundle orangeStart) {
		super.onCreate(orangeStart);
		setContentView(R.layout.splash);
		song = MediaPlayer.create(Splash.this, com.example.testapp.R.raw.fireflies);
		song.start();
		Thread waitFor = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException error){
					error.printStackTrace();
				} finally{
					Intent changeScreen = new Intent("com.example.testapp.MENU");
					startActivity(changeScreen);
				}
			}
		};
		waitFor.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		song.release();
		finish();
	}
	
}
