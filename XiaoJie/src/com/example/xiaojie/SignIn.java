package com.example.xiaojie;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        
        Button login = (Button)findViewById(R.id.signin);
        Button signup = (Button)findViewById(R.id.signup);
        Button forget = (Button)findViewById(R.id.forget);
        
        login.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				EditText Username = (EditText)findViewById(R.id.username);
		        EditText Password = (EditText)findViewById(R.id.password);
				String username = Username.getText().toString();
				String password = Password.getText().toString();
				
				if(username.length()==0){
					Toast toast = Toast.makeText(SignIn.this, "Please input your username", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 200);
					toast.show();
				}
				else if(password.length()==0){
					Toast toast = Toast.makeText(SignIn.this, "Please input your password", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 200);
					toast.show();
				}
				else{
					//TODO sign in, the values:username,password are usable
					
					
				}
			}});
        
        signup.setOnClickListener(new OnClickListener(){
          	@Override
        	public void onClick(View v) {
          		//TODO SignUp.java
          		
          		Intent intent_signup = new Intent().setClass(SignIn.this, SignUp.class);
				startActivity(intent_signup);
          		//finish();
          		
          	}
        });
        
        forget.setOnClickListener(new OnClickListener(){
          	@Override
        	public void onClick(View v) {
          		//TODO forget password
          		
          		
          	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_in, menu);
        return true;
    }
    
}
