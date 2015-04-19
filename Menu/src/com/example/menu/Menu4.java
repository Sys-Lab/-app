package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
//import android.content.Context;    
//import android.os.Handler;  
//import android.util.AttributeSet;  
//import android.view.InflateException;  
//import android.view.LayoutInflater;

public class Menu4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        setTitle("Menu4");
        
        Button menu1 = (Button) findViewById(R.id.Menu1);
        menu1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu4.this, Menu1.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
        Button menu2 = (Button) findViewById(R.id.Menu2);
        menu2.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu4.this, Menu2.class);
          		startActivity(intent);
          		finish();
        	}
        });

        Button menu3 = (Button) findViewById(R.id.Menu3);
        menu3.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent().setClass(Menu4.this, Menu3.class);
          		startActivity(intent);
          		finish();
        	}
        });
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  
        super.onCreateOptionsMenu(menu);  
        MenuInflater inflater = new MenuInflater(getApplicationContext());  
        inflater.inflate(R.menu.mainmenu, menu);  
//        setMenuBackground();  
        return true;  
    }  
  
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.setting:
	        Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
		    break;
        case R.id.about:
        	Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        	break;
	    case R.id.search:
	    	Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
	    	break;
        }
        return super.onOptionsItemSelected(item);
    }
    
//    protected void setMenuBackground() {
//        Menu4.this.getLayoutInflater().setFactory(new android.view.LayoutInflater.Factory() {    
//            public View onCreateView(String name, Context context, AttributeSet attrs) {  
//                // 指定自定义inflate的对象
//                if (name.equalsIgnoreCase("com.android.internal.view.menu.IconMenuItemView")) {  
//                    try {
//                        LayoutInflater f = getLayoutInflater();
//                        final View view = f.createView(name, null, attrs);
//                        new Handler().post(new Runnable() {
//                            public void run() {
//                                // 设置背景图片  
//                                view.setBackgroundResource(R.drawable.menu_background);  
//                            }  
//                        });  
//                        return view;  
//                    } catch (InflateException e) {  
//                        e.printStackTrace();  
//                    } catch (ClassNotFoundException e) {  
//                        e.printStackTrace();  
//                    }  
//                }  
//                return null;  
//            }  
//        });  
//    }

}
