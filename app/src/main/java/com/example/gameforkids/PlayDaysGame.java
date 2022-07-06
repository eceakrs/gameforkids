package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayDaysGame extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_game);

        int a = new Integer((int) Math.floor(Math.random()*4));

        if(a==0){
            ImageView clockIm = findViewById(R.id.days);
            Drawable drawable = getResources().getDrawable(R.drawable.days_worksheet);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonmonday);
            button2 = findViewById(R.id.buttonwednesday);
            button3 = findViewById(R.id.buttonfriday);
            button4 = findViewById(R.id.buttonsaturday);

            TextView ques = findViewById(R.id.question);
            ques.setText("TRAIN 1?");
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, TrueAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.days);
            Drawable drawable = getResources().getDrawable(R.drawable.days_worksheet);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.question);
            ques.setText("TRAIN 3?");

            button1 = findViewById(R.id.buttonmonday);
            button2 = findViewById(R.id.buttonwednesday);
            button3 = findViewById(R.id.buttonfriday);
            button4 = findViewById(R.id.buttonsaturday);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, TrueAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.days);
            Drawable drawable = getResources().getDrawable(R.drawable.days_worksheet);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.question);
            ques.setText("TRAIN 5?");


            button1 = findViewById(R.id.buttonmonday);
            button2 = findViewById(R.id.buttonwednesday);
            button3 = findViewById(R.id.buttonfriday);
            button4 = findViewById(R.id.buttonsaturday);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, TrueAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

        if(a==3){
            ImageView clockIm = findViewById(R.id.days);
            Drawable drawable = getResources().getDrawable(R.drawable.days_worksheet);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.question);
            ques.setText("TRAIN 6?");


            button1 = findViewById(R.id.buttonmonday);
            button2 = findViewById(R.id.buttonwednesday);
            button3 = findViewById(R.id.buttonfriday);
            button4 = findViewById(R.id.buttonsaturday);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, FalseAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlayDaysGame.this, TrueAnswerDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });
        }

    }
}
