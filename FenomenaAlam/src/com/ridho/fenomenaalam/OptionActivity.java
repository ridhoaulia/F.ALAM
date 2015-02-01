package com.ridho.fenomenaalam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OptionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.option, menu);
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
	public void openFrontBanjir(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontBanjirActivity.class);
    	startActivity(intentSaya);
    }
	public void openFrontGempa(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontGempaActivity.class);
    	startActivity(intentSaya);
    }
	public void openFrontTsunami(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontTsunamiActivity.class);
    	startActivity(intentSaya);
    }
	public void openFrontTornado(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontTornadoActivity.class);
    	startActivity(intentSaya);
    }
	public void openFrontVolcano(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontVolcanoActivity.class);
    	startActivity(intentSaya);
    }
	public void openFrontLandslide(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								FrontLandslideActivity.class);
    	startActivity(intentSaya);
    }
}
