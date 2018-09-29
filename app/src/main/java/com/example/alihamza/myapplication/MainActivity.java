package com.example.alihamza.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mCustomer, mDriver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDriver=(Button) findViewById(R.id.driver);
        mCustomer=(Button) findViewById(R.id.customer);
        mDriver.setOnClickListener(new view.onClickListener() {
            @override
            public void onClick(view v) {
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        } );
        //ali
fahadzaman
    }
}
