package com.turtle.ui_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class test1 extends Activity {
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);
	}
	
	    
	    public void test2 (View view){
	    	Intent intent =new Intent(this,test2.class);
	    	startActivity(intent);
	    }
	    
	    public void test3 (View view){
	    	Intent intent =new Intent(this,test3.class);
	    	startActivity(intent);
	    }
	    
	    public void test4 (View view){
	    	Intent intent =new Intent(this,test4.class);
	    	startActivity(intent);
	    }
	    
	    public void detail (View view){
	    	Intent intent =new Intent(this,detail.class);
	    	startActivity(intent);
	    }
}
