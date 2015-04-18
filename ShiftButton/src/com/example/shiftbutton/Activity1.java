package com.example.shiftbutton;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        
        Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		jumpToLayout2();
        	}
        });
        
        Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		EditText et = (EditText) findViewById(R.id.height);
        		String height;
        		RadioButton rb1 = (RadioButton) findViewById(R.id.sex1);
        		int len = et.getText().toString().length();
        		Bundle bundle = new Bundle();
        		Intent intent = new Intent();
        		intent.setClass(Activity1.this, Activity2.class);
        		bundle.putInt("Check", len);
        		
        		if(len!=0)
        		{
        			height = et.getText().toString();
	        		String sex = "";
	        		if(rb1.isChecked())
	        		{
	        			sex = "M";
	        		}
	        		else
	        		{
	        			sex = "F";
	        		}
	        		bundle.putString("height", height);
	        		bundle.putString("sex", sex);
	        	
	        		intent.putExtras(bundle);
	        		startActivityForResult(intent,0);
        		}
        		else
        		{
        			intent.putExtras(bundle);
        			startActivity(intent);
        		}
        	}
        });
        
        Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		new AlertDialog.Builder(Activity1.this).
        		setTitle(R.string.title).
        		setMessage(R.string.message).
        		setPositiveButton
        		(
        			R.string.str_ok,
        			new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							finish();
						}
					}
        		).show();
        	}
        });
        
        Button b7=(Button) findViewById(R.id.button7);
        b7.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		EditText et = (EditText) findViewById(R.id.height);
        		TextView tv1 = (TextView) findViewById(R.id.text1);

        		tv1.setText(Integer.toString(et.getText().toString().length()));
        	}
        });
        
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
    	switch(resultCode)
    	{
    	case RESULT_OK:
    		Bundle bunde = data.getExtras();
    		String sex = bunde.getString("sex");
    		String height = bunde.getString("height");
    		
    		EditText et = (EditText) findViewById(R.id.height);
    		RadioButton rb1 = (RadioButton) findViewById(R.id.sex1);
    		RadioButton rb2 = (RadioButton) findViewById(R.id.sex2);
    		
    		et.setText(height);
    		if(sex.equals("M"))
    		{
    			rb1.setChecked(true);
    		}
    		else
    		{
    			rb2.setChecked(true);
    		}
    		break;
    	default:
    		break;
    	}
    }
    
    public void jumpToLayout2()
    {
    	setContentView(R.layout.activity_activity2);
    	
    	Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		jumpToLayout1();
        	}
        });
    }
    
    public void jumpToLayout1()
    {
    	setContentView(R.layout.activity_activity1);
    	
    	Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		jumpToLayout2();
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity1, menu);
        return true;
    }
    
}
