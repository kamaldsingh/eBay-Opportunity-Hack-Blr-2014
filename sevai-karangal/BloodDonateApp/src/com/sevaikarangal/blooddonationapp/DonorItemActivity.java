package com.sevaikarangal.blooddonationapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DonorItemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_donor_item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.donor_item, menu);
		return true;
	}

}
