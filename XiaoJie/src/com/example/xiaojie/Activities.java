package com.example.xiaojie;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Activities extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_activities);
	    
	    ArrayList<HashMap<String,Object>> activityies = 
        		new ArrayList<HashMap<String,Object>>();
        
        for(int i = 0; i < 10; i++){
        	HashMap<String,Object> activity = new HashMap<String,Object>();
        	activity.put("img", R.drawable.user);
        	activity.put("name", "Avtivity("+(i+1)+")");
        	activity.put("des", "This is activity"+(i+1));
        	activity.put("date", "2015.04.22");
        	activityies.add(activity);
        }
        
        SimpleAdapter saImageItems = new SimpleAdapter(
        		this,  //activity
        		activityies,  //Map����Դ
        		R.layout.ly_lv_activities,  //ģ�岼��
        		new String[]{"img","name","des","date"},  //ѡȡMap��ֵ
        		new int[] {R.id.iv_activities_img,R.id.tv_activities_name,R.id.tv_activities_des,R.id.tv_activities_date});  //ģ�岼�ֵ����        
        ListView lv = (ListView) findViewById(R.id.lv_activities);
        lv.setAdapter(saImageItems);

        lv.setOnItemClickListener(new OnItemClickListener(){   
        	@Override   
        	public void onItemClick(AdapterView<?> parent, View view,  
				    int position, long id) {   
				    TextView name = (TextView) view.findViewById(R.id.tv_activities_name);
				    TextView date = (TextView) view.findViewById(R.id.tv_activities_date);
				    TextView des = (TextView) view.findViewById(R.id.tv_activities_des);
				    Toast.makeText(Activities.this, name.getText().toString()+"\n"+date.getText().toString()+"\n"+des.getText().toString(), Toast.LENGTH_SHORT).show();
        	}
        });
    }
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_in, menu);
        return true;
    }
}
