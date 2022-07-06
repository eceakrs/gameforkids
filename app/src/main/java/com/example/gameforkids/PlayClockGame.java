package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayClockGame extends AppCompatActivity {

    Button button1;
    Button button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_game);

        int a = new Integer((int) Math.floor(Math.random()*2));

        if(a==0){
            ImageView clockIm = findViewById(R.id.clock);
            Drawable drawable = getResources().getDrawable(R.drawable.sevenoclock);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonseven);
            button2 = findViewById(R.id.buttonfour);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayClockGame.this, TrueAnswerClockGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

        });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayClockGame.this, FalseAnswerClockGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

    }

        if(a==1){
            ImageView clockIm = findViewById(R.id.clock);
            Drawable drawable = getResources().getDrawable(R.drawable.sixoclock);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonseven);
            button2 = findViewById(R.id.buttonsix);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayClockGame.this, FalseAnswerClockGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayClockGame.this, TrueAnswerClockGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

    }
}
