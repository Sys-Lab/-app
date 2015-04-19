package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        setTitle("Menu2");
        
        Button menu1 = (Button) findViewById(R.id.Menu1);
        menu1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu2.this, Menu1.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu3 = (Button) findViewById(R.id.Menu3);
        menu3.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu2.this, Menu3.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu4 = (Button) findViewById(R.id.Menu4);
        menu4.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu2.this, Menu4.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        SubMenu subMenu = menu.addSubMenu(1, 100, 100, "桃子");
        subMenu.add(2, 101, 101, "大桃子");
        subMenu.add(2, 102, 102, "小桃子");
        return true;
    }

}
