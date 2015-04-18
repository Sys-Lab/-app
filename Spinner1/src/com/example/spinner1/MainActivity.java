package com.example.spinner1;

import android.os.Bundle;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
//        //建立数据源
//        String[] mItems = getResources().getStringArray(R.array.majors);
//        // 建立Adapter并且绑定数据源
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mItems);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        //绑定 Adapter到控件
//        spinner .setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            
        	
        	@Override
            public void onItemSelected(AdapterView<?> parent, View view, 
                    int pos, long id) {
            
                String[] languages = getResources().getStringArray(R.array.majors);
                Toast.makeText(MainActivity.this, "你点击的是:"+languages[pos], Toast.LENGTH_SHORT).show();
            }
            
            
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
    }
  
}
