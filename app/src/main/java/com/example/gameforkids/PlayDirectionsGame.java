package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayDirectionsGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction_game);

        int a = new Integer((int) Math.floor(Math.random()*3));

        if(a==0){
            ImageView clockIm = findViewById(R.id.direction);
            Drawable drawable = getResources().getDrawable(R.drawable.turnright);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonright);
            button2 = findViewById(R.id.buttonstraight);
            button3 = findViewById(R.id.buttonround);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, TrueAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.direction);
            Drawable drawable = getResources().getDrawable(R.drawable.gostraight);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonright);
            button2 = findViewById(R.id.buttonstraight);
            button3 = findViewById(R.id.buttonround);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, TrueAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.direction);
            Drawable drawable = getResources().getDrawable(R.drawable.turnroundandaroundabout);
            clockIm.setImageDrawable(drawable);


            button1 = findViewById(R.id.buttonright);
            button2 = findViewById(R.id.buttonstraight);
            button3 = findViewById(R.id.buttonround);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDirectionsGame.this, TrueAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }



    }
}
