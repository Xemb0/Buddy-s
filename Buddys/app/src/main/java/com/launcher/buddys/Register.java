package com.launcher.buddys;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.launcher.buddys.Register;


public class Register extends AppCompatActivity {
    Button mRegisterBtn,mAlreadyBuddyBtn;
    TextView mLoginBtn;
    EditText mFName,mLName,mPassword,mPhoneEmail;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mFName = findViewById(R.id.FirstName);
        mLName = findViewById(R.id.LastName);
        mPhoneEmail = findViewById(R.id.PhoneEmail);
        mPassword = findViewById(R.id.Password_Login);
        mRegisterBtn =findViewById(R.id.Button_NewAccount);
        mAlreadyBuddyBtn = findViewById(R.id.Button_AlreadyABuddy);


        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
        mAlreadyBuddyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });






    }

}


