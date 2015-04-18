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
//        //��������Դ
//        String[] mItems = getResources().getStringArray(R.array.majors);
//        // ����Adapter���Ұ�����Դ
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mItems);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        //�� Adapter���ؼ�
//        spinner .setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            
        	
        	@Override
            public void onItemSelected(AdapterView<?> parent, View view, 
                    int pos, long id) {
            
                String[] languages = getResources().getStringArray(R.array.majors);
                Toast.makeText(MainActivity.this, "��������:"+languages[pos], Toast.LENGTH_SHORT).show();
            }
            
            
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
    }
  
}
