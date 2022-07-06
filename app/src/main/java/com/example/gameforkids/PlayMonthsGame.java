package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayMonthsGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_game);

        int a = new Integer((int) Math.floor(Math.random()*3));

        if(a==0){
            ImageView clockIm = findViewById(R.id.months);
            Drawable drawable = getResources().getDrawable(R.drawable.months_ws1);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonmay);
            button2 = findViewById(R.id.buttondecember);
            button3 = findViewById(R.id.buttonoctober);

            TextView ques = findViewById(R.id.question);
            ques.setText("Which MONTH is in SPRING ?");
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, TrueAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.months);
            Drawable drawable = getResources().getDrawable(R.drawable.months_ws1);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.question);
            ques.setText("Which MONTH is in WINTER?");


            button1 = findViewById(R.id.buttonmay);
            button2 = findViewById(R.id.buttondecember);
            button3 = findViewById(R.id.buttonoctober);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, TrueAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.months);
            Drawable drawable = getResources().getDrawable(R.drawable.months_ws1);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.question);
            ques.setText("Which MONTH is in FALL ? ");



            button1 = findViewById(R.id.buttonmay);
            button2 = findViewById(R.id.buttondecember);
            button3 = findViewById(R.id.buttonoctober);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, FalseAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayMonthsGame.this, TrueAnswerMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }


        }


}
