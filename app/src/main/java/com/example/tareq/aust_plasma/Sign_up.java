package com.example.tareq.aust_plasma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_up extends AppCompatActivity {

    private Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        sign=(Button)findViewById(R.id.sign_up_signup_act);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sign_up.this,Home_activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
