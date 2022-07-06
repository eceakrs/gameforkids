package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayDigitGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_game);

        int a = new Integer((int) Math.floor(Math.random()*3));

        if(a==0){
            ImageView clockIm = findViewById(R.id.digit);
            Drawable drawable = getResources().getDrawable(R.drawable.digits3);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.button190);
            button2 = findViewById(R.id.button132);
            button3 = findViewById(R.id.button768);

            TextView ques = findViewById(R.id.questiondigits);
            ques.setText("Pick the same digits as this one!");
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, TrueAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.digit);
            Drawable drawable = getResources().getDrawable(R.drawable.digits1);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.questiondigits);
            ques.setText("Pick the same digits as this one!");

            button1 = findViewById(R.id.button190);
            button2 = findViewById(R.id.button132);
            button3 = findViewById(R.id.button768);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, TrueAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.digit);
            Drawable drawable = getResources().getDrawable(R.drawable.digits2);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.questiondigits);
            ques.setText("Pick the same digits as this one!");

            button1 = findViewById(R.id.button190);
            button2 = findViewById(R.id.button132);
            button3 = findViewById(R.id.button768);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, FalseAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDigitGame.this, TrueAnswerDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }



    }
}
