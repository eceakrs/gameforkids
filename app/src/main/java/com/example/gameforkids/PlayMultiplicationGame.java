package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayMultiplicationGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_game);

        int a = new Integer((int) Math.floor(Math.random()*3));

        if(a==0){
            ImageView clockIm = findViewById(R.id.multiplication);
            Drawable drawable = getResources().getDrawable(R.drawable.twotimesfive);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.button10);
            button2 = findViewById(R.id.button18);
            button3 = findViewById(R.id.button12);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, TrueAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.multiplication);
            Drawable drawable = getResources().getDrawable(R.drawable.multiplication1);
            clockIm.setImageDrawable(drawable);


            button1 = findViewById(R.id.button10);
            button2 = findViewById(R.id.button18);
            button3 = findViewById(R.id.button12);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, TrueAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.multiplication);
            Drawable drawable = getResources().getDrawable(R.drawable.multiplication2);
            clockIm.setImageDrawable(drawable);


            button1 = findViewById(R.id.button10);
            button2 = findViewById(R.id.button18);
            button3 = findViewById(R.id.button12);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, TrueAnswerMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMultiplicationGame.this, FalseAnswerDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }



    }
}
