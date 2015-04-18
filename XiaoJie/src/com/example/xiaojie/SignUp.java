package com.example.xiaojie;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SignUp extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Spinner Department = (Spinner) findViewById(R.id.signup_sp_departments);
        Spinner Grade = (Spinner) findViewById(R.id.signup_sp_grades);
		Button signup = (Button) findViewById(R.id.signup_bt_signup);
		String department, grade;
		
        String[] departments = getResources().getStringArray(R.array.departments);
        ArrayAdapter<String> adapter_departments=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, departments);
        adapter_departments.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Department.setAdapter(adapter_departments);
        
        Department.setOnItemSelectedListener(new OnItemSelectedListener() {
        	@Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                String[] departments = getResources().getStringArray(R.array.departments);
                //TODO get value: departments[pos]
                //Toast.makeText(SignUp.this, "你点击的是:"+departments[pos], Toast.LENGTH_SHORT).show();
           	}
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        
        String[] grades = getResources().getStringArray(R.array.grades);
        ArrayAdapter<String> adapter_grades=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, grades);
        adapter_grades.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Grade.setAdapter(adapter_grades);
        
        Grade.setOnItemSelectedListener(new OnItemSelectedListener() {
        	@Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                String[] grades = getResources().getStringArray(R.array.grades);
                //TODO get value: grades[pos]
                //Toast.makeText(SignUp.this, "你点击的是:"+grades[pos], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        
        signup.setOnClickListener(new OnClickListener(){
          	@Override
        	public void onClick(View v) {
          		//TODO SignUp.java
          		
                EditText Username = (EditText) findViewById(R.id.signup_tv_username);
                EditText Password = (EditText) findViewById(R.id.signup_tv_password);
        		EditText Repeat = (EditText) findViewById(R.id.signup_tv_repeat);
        		EditText Email = (EditText) findViewById(R.id.signup_tv_email);
        		EditText Realname = (EditText) findViewById(R.id.signup_tv_realname);
        		EditText Studentid = (EditText) findViewById(R.id.signup_tv_studentid);
        		
        		String username =  Username.getText().toString();
        		String password =  Password.getText().toString();
        		String repeat =  Repeat.getText().toString();
        		String email =  Email.getText().toString();
        		String realname =  Realname.getText().toString();
        		String studentid =  Studentid.getText().toString();
        		
        		if((username.length()+password.length()+repeat.length()+email.length()+realname.length()+studentid.length())==0){
        			Toast toast = Toast.makeText(SignUp.this, "Please input your information", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 200);
					toast.show();
        		}
        		else if(password == repeat) {
        			
        			Bundle bundle = new Bundle();
                    bundle.putString("username",username);
                    bundle.putString("password", password);
                    bundle.putString("email", email);
                    bundle.putString("realname", realname);
                    bundle.putString("studentid", studentid);
              		
              		//Intent intent_signup = new Intent().setClass(SignUp.this, SignIn.class);
    				//intent_signup.putExtras(bundle);
              		//startActivity(intent_signup);
              		//finish();
        		}
        		
          	}
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_up, menu);
        return true;
    }
    
}

