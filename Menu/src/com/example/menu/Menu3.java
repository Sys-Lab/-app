package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public class Menu3 extends Activity {

	Button b1;
	Button b2;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        setTitle("Menu3");
        
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        registerForContextMenu(b1);
        registerForContextMenu(b2);
        
        Button menu1 = (Button) findViewById(R.id.Menu1);
        menu1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu3.this, Menu1.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu2 = (Button) findViewById(R.id.Menu2);
        menu2.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu3.this, Menu2.class);
          		startActivity(intent);
          		finish();
        	}
        });

        Button menu4 = (Button) findViewById(R.id.Menu4);
        menu4.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu3.this, Menu4.class);
          		startActivity(intent);
          		finish();
        	}
        });
    }
    
	@Override
    public void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        if(v==b1){
            menu.setHeaderTitle("这是1");
            menu.add(200, 200, 200, "Context Menu 1");
            menu.add(200, 201, 201, "Context Menu 2");
        }
        else if(v==b2){
            menu.setHeaderTitle("这是2");
            menu.add(300, 300, 300, "C 1");
            menu.add(300, 301, 301, "C 2");
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

}