package com.example.xiaojie;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainPage extends TabActivity {

	TabHost mTabHost;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        
        mTabHost = getTabHost();
        
        Intent intent_activity = new Intent();
        intent_activity.setClass(this,Activities.class);
        
        Intent intent_notices = new Intent();
        intent_notices.setClass(this,Notices.class);
        
        Intent intent_user = new Intent();
        intent_user.setClass(this,SignIn.class);
        
        mTabHost.addTab(mTabHost.newTabSpec("tab1")
                .setIndicator("Activities",getResources().getDrawable(R.drawable.img_tab1))
                .setContent(intent_activity));
        
        mTabHost.addTab(mTabHost.newTabSpec("tab2")
                .setIndicator("notices",getResources().getDrawable(R.drawable.img_tab2))
                .setContent(intent_notices));
        
        mTabHost.addTab(mTabHost.newTabSpec("tab3")
                .setIndicator("user",getResources().getDrawable(R.drawable.img_tab3))
                .setContent(intent_user));
        
        mTabHost.setBackgroundColor(Color.argb(0,0,0,221));
        mTabHost.setCurrentTab(0);
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  
        super.onCreateOptionsMenu(menu);  
        MenuInflater inflater = new MenuInflater(getApplicationContext());  
        inflater.inflate(R.menu.menu_main_page, menu);  
//        setMenuBackground();  
        return true;  
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.mi_signin:
	        Intent intent = new Intent().setClass(MainPage.this, SignIn.class);
      		startActivity(intent);
	        break;
	    default:
	    	break;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
