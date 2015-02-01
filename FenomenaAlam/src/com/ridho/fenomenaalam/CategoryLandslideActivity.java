package com.ridho.fenomenaalam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CategoryLandslideActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_landslide);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.category_landslide, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void openLandslide1(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								Landslide1Activity.class);
    	startActivity(intentSaya);
    }
	public void openLandslide2(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								Landslide2Activity.class);
    	startActivity(intentSaya);
    }
	public void openYoutube(View v){
		String url = "https://www.youtube.com/watch?v=iIW_o95gwjs";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
}
