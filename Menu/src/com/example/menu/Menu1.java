package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Menu1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        setTitle("Menu1");
        
        Button menu2 = (Button) findViewById(R.id.Menu2);
        menu2.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu1.this, Menu2.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu3 = (Button) findViewById(R.id.Menu3);
        menu3.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu1.this, Menu3.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu4 = (Button) findViewById(R.id.Menu4);
        menu4.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu1.this, Menu4.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
    	//menu.add(group ID, item ID, order ID, String title);
    	menu.add(0, 1, 2, "苹果");
        menu.add(0, 2, 1, "香蕉");
        menu.add(1, 3, 1, "雪梨");
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
    	switch(item.getItemId()){
		case 1:
		    Toast.makeText(this, "你选的是苹果", Toast.LENGTH_SHORT).show();
		    break;
		case 2:
		    Toast.makeText(this, "你选的是香蕉", Toast.LENGTH_SHORT).show();
			break;
		case 3:
		    Toast.makeText(this, "你选的是雪梨", Toast.LENGTH_SHORT).show();
			break;
    	}
//        Toast.makeText(this, "你选的是" + (MenuItem)findViewById(item.getItemId()), Toast.LENGTH_SHORT).show(); 
        return true;
    }
}
