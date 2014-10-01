package com.example.screenorientationfixedlandscape;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Add this code in Manifest for fixed portrait mode irrespective of the phone orientation 
		/** android:screenOrientation="landscape" **/
		Toast.makeText(this, "It is in fixed landscape mode , code for fixed potrait is in Mainfest", Toast.LENGTH_SHORT).show();
	}

	

}
