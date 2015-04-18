package com.example.shiftbutton;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {

	Bundle bunde;
	Intent intent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        
        intent = this.getIntent();
        bunde = intent.getExtras();
        int check = bunde.getInt("Check");
        TextView tv1=(TextView) findViewById(R.id.result);
        
        tv1.setText("Please");
        
        if(check >= 1) 
		{	
	        String sex = bunde.getString("sex");
	        double height = Double.parseDouble(bunde.getString("height"));
	        
	        String sexText="";
	        if(sex.equals("M"))
	        {
	        	sexText="男性";
	        }
	        else
	        {
	        	sexText="女性";
	        }
	        
	        String weight=this.getWeight(sex, height);

	        tv1.setText(check + "你是一位" + sexText + "\n你的身高是"
	        		+ height + "厘米\n你的标准体重是" + weight + "公斤");
		}
        else tv1.setText("Please input first");

        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		jumpToLayout1();
        	}
        });
        
        Button b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		Intent intent2 = new Intent();
        		intent2.setClass(Activity2.this, Activity1.class);
        		
        		startActivity(intent2);
        		//Activity2.this.finish();
        	};
        });
        
        Button b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View V)
        	{
        		Activity2.this.setResult(RESULT_OK, intent);
        		Activity2.this.finish();
        	}
        });
        
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
    
    private String format(double num){
    	NumberFormat formatter = new DecimalFormat("0.00");
    	String s=formatter.format(num);
    	return s;
    }
    
    private String getWeight(String sex, double height){
    	String weight="";
    	if(sex.equals("M"))
    	{
    		weight=format((height-80)*0.7);
    	}
    	else
    	{
    		weight=format((height-70)*0.6);
    	}
    	return weight;
    }
    
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
    	// Inflate the menu; this adds items to the action bar if it is present.
    	getMenuInflater().inflate(R.menu.activity1, menu);
    	return true;
    }
}
