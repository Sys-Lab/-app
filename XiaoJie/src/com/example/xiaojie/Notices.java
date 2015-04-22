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

public class Notices extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_notices);
	    
	    ArrayList<HashMap<String,Object>> notices = 
        		new ArrayList<HashMap<String,Object>>();
        
        for(int i = 0; i < 10; i++){
        	HashMap<String,Object> notice = new HashMap<String,Object>();
        	notice.put("img", R.drawable.notice);
        	notice.put("name", "Notice("+(i+1)+")");
        	notice.put("des", "This is notice"+(i+1));
        	notice.put("date", "2015.04.22");
        	notices.add(notice);
        }
        
        SimpleAdapter saImageItems = new SimpleAdapter(
        		this,  //activity
        		notices,  //Map数据源
        		R.layout.ly_lv_notices,  //模板布局
        		new String[]{"img","name","des","date"},  //选取Map的值
        		new int[] {R.id.iv_notices_img,R.id.tv_notices_name,R.id.tv_notices_des,R.id.tv_notices_date});  //模板布局的组件
        
        ListView lv = (ListView) findViewById(R.id.lv_notices);
        lv.setAdapter(saImageItems);

        lv.setOnItemClickListener(new OnItemClickListener(){   
        	@Override   
        	public void onItemClick(AdapterView<?> parent, View view,  
				    int position, long id) {   
				    TextView name = (TextView) view.findViewById(R.id.tv_notices_name);
				    TextView date = (TextView) view.findViewById(R.id.tv_notices_date);
				    TextView des = (TextView) view.findViewById(R.id.tv_notices_des);
				    Toast.makeText(Notices.this, name.getText().toString()+"\n"+date.getText().toString()+"\n"+des.getText().toString(), Toast.LENGTH_SHORT).show();
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
