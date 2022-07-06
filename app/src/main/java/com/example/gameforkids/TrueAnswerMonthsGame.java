package com.example.gameforkids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TrueAnswerMonthsGame extends AppCompatActivity {

    Button button1;
    Button button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true);

        button1 = findViewById(R.id.playagain);
        button2 = findViewById(R.id.playanother);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent detailIntent = new Intent(TrueAnswerMonthsGame.this, PlayMonthsGame.class);
                detailIntent.putExtra("title",R.id.titleDetail);
                detailIntent.putExtra("image", R.id.gamesImageDetail);
                startActivity(detailIntent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent detailIntent = new Intent(TrueAnswerMonthsGame.this, MainActivity.class);
                detailIntent.putExtra("title",R.id.titleDetail);
                detailIntent.putExtra("image", R.id.gamesImageDetail);
                startActivity(detailIntent);
            }

        });

    };


}
