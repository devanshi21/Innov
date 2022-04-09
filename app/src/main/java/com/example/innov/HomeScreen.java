package com.example.innov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {
    public void getRandomQuote(TextView dyntext){
        int numQuotes = 10;
        String[] quotes = new String[] {"The best preperation for \n" +
                "tomorrow is to do best today", "The best preperation for \n" +
                "tomorrow is to do best today", "The best preperation for \n" +
                "tomorrow is to do best today"};
        String randomQuote = quotes[(int) (Math.random() * quotes.length)];
        dyntext.setText(randomQuote);
    }
    public void getRandomTeaser(TextView dyntext){
        int numQuotes = 10;
        String[] quotes = new String[] {"A man pushes his car to a hotel and tells the owner he’s bankrupt. Why?"};
        String randomQuote = quotes[(int) (Math.random() * quotes.length)];
        dyntext.setText(randomQuote);
    }
    Button sync_calander;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        TextView dynquote=findViewById(R.id.dynamic_quote);
        getRandomQuote(dynquote);
        TextView dynteaser=findViewById(R.id.dynamic_teaser);
        getRandomTeaser(dynteaser);

        //start for sync calander button press
        sync_calander = (Button)findViewById(R.id.btnforsync);
        sync_calander.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            Intent intent = new Intent(HomeScreen.this, Timing.class);
            startActivity(intent);
            }
        });
    }
}