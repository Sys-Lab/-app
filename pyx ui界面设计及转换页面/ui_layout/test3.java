package com.turtle.ui_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class test3 extends Activity {

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout3);
	}
	
	  public void test1 (View view){
	    	Intent intent =new Intent(this,test1.class);
	    	startActivity(intent);
	    }
	    
	    public void test2 (View view){
	    	Intent intent =new Intent(this,test2.class);
	    	startActivity(intent);
	    }
	    

	    public void test4 (View view){
	    	Intent intent =new Intent(this,test4.class);
	    	startActivity(intent);
	    }
}
