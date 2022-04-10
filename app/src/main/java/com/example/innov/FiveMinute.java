package com.example.innov;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FiveMinute extends AppCompatActivity {
    public int counter;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_min_activity);


        button= (Button) findViewById(R.id.timerbtn);
        textView= (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                new CountDownTimer(50000, 1000){
                    public void onTick(long millisUntilFinished){
                        if(counter<10000){
                            textView.setText(String.valueOf("< 1 Minute"));
                        }else if(counter>=10000 && counter<20000){
                            textView.setText(String.valueOf("< 2 Minute"));
                        }else if(counter>=20000 && counter<30000){
                            textView.setText(String.valueOf("< 3 Minute"));
                        }else if(counter>=30000 && counter<40000){
                            textView.setText(String.valueOf("< 4 Minute"));
                        }
                        counter++;
                    }
                    public  void onFinish(){
                        textView.setText("Good work!!");
                    }
                }.start();
            }
        });
    }
}