package com.ridho.fenomenaalam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CategoryVolcanoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_volcano);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.category_volcano, menu);
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
	public void openVolcano1(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								Volcano1Activity.class);
    	startActivity(intentSaya);
    }
	public void openVolcano2(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								Volcano2Activity.class);
    	startActivity(intentSaya);
    }
	public void openVolcano3(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								Volcano3Activity.class);
    	startActivity(intentSaya);
	}
	public void openYoutube(View v){
		String url = "https://www.youtube.com/watch?v=z3IIitKGa9A";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
}
