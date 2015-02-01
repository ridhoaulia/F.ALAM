package com.ridho.fenomenaalam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
  //Jika Tekan Tombol back
    public void onBackPressed() {
      exit();//Pergi ke method exit 
    }
    private void exit() {
     AlertDialog.Builder builder = new AlertDialog.Builder(this);
     builder.setMessage("Anda Yakin Ingin Keluar ?")
     .setCancelable(false)//tidak bisa tekan tombol back
     //jika pilih yess
     .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
      public void onClick(DialogInterface dialog, int id) {
       finish();
      }
     })
     //jika pilih no
     .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
      public void onClick(DialogInterface dialog, int id) {
       dialog.cancel();
      }
     }).show();

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
    public void openOption(View v){
    	Intent intentSaya = new Intent(getApplicationContext(),
    								OptionActivity.class);
    	startActivity(intentSaya);
    }
}
