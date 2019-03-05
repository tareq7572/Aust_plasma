package com.example.tareq.aust_plasma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_activity extends AppCompatActivity {

    private Button sign_in,sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);
        sign_in=(Button)findViewById(R.id.sign_in_first_act);
        sign_up=(Button)findViewById(R.id.sign_up_first_act);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First_activity.this,Sign_in.class);
                startActivity(intent);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First_activity.this,Sign_up.class);
                startActivity(intent);
            }
        });

    }

}
