package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PlaySeasonsGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_game);

        int a = new Integer((int) Math.floor(Math.random()*4));

        if(a==0){
            ImageView clockIm = findViewById(R.id.season);
            Drawable drawable = getResources().getDrawable(R.drawable.winter);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonwinter);
            button2 = findViewById(R.id.buttonsummer);
            button3 = findViewById(R.id.buttonfall);
            button4 = findViewById(R.id.buttonspring);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, TrueAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.season);
            Drawable drawable = getResources().getDrawable(R.drawable.summer);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonwinter);
            button2 = findViewById(R.id.buttonsummer);
            button3 = findViewById(R.id.buttonfall);
            button4 = findViewById(R.id.buttonspring);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, TrueAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.season);
            Drawable drawable = getResources().getDrawable(R.drawable.fall);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonwinter);
            button2 = findViewById(R.id.buttonsummer);
            button3 = findViewById(R.id.buttonfall);
            button4 = findViewById(R.id.buttonspring);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, TrueAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==3){
            ImageView clockIm = findViewById(R.id.season);
            Drawable drawable = getResources().getDrawable(R.drawable.spring);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonwinter);
            button2 = findViewById(R.id.buttonsummer);
            button3 = findViewById(R.id.buttonfall);
            button4 = findViewById(R.id.buttonspring);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerClockGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, FalseAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySeasonsGame.this, TrueAnswerSeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

    }
}
