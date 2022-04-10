package com.example.innov;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Timing extends AppCompatActivity {
    Button five_min_btn,ten_min_btn,fifteen_min_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timing_activity);

        //start activity for 5 minutes
        five_min_btn = (Button)findViewById(R.id.five_minute);
        five_min_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Timing.this, FiveMinute.class);
                startActivity(intent);
            }
        });

        //start activity for 10 minutes
        ten_min_btn = (Button)findViewById(R.id.ten_minute);
        ten_min_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Timing.this, TenMinute.class);
                startActivity(intent);
            }
        });

        //start activity for 15 minutes
        fifteen_min_btn = (Button)findViewById(R.id.fifteen_minute);
        fifteen_min_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Timing.this, FifteenMinute.class);
                startActivity(intent);
            }
        });
    }
}