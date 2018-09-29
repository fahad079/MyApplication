package com.example.alihamza.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class DriverLoginActivity extends AppCompatActivity {
    private EditText mEmail,mPassword;
    private Button mLogin,mRegistration;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        mEmail= findViewById(R.id.email);
        mPassword= findViewById(R.id.password);

        mLogin= findViewById(R.id.login);
        mRegistration= findViewById(R.id.reg);
    }
}
