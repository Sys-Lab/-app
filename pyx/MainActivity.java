package com.iteima.dail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt_dail= (Button)this.findViewById(R.id.bt_dail);
		bt_dail.setOnClickListener(new MyListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	private class MyListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			EditText et_number=(EditText)MainActivity.this.findViewById(R.id.et_number);
			String number=et_number.getText().toString();
			Intent intent=new Intent();
			intent.setAction(Intent.ACTION_CALL);
			intent.setData(Uri.parse("tel: "+number));
			startActivity(intent);
		}
	
	}
}
