package com.example.gameforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlaySimilarPics extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similarpics_game);

        int a = new Integer((int) Math.floor(Math.random()*3));

        if(a==0){
            ImageView clockIm = findViewById(R.id.questionpic);
            Drawable drawable = getResources().getDrawable(R.drawable.monkey);
            clockIm.setImageDrawable(drawable);

            button1 = findViewById(R.id.buttonmonkey);
            button2 = findViewById(R.id.buttonlion);
            button3 = findViewById(R.id.buttonwhale);

            TextView ques = findViewById(R.id.questionsimilarpics);
            ques.setText("FIND THE PAIR OF THIS PICTURE");
            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, TrueAnswerSimilarPics.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==1){
            ImageView clockIm = findViewById(R.id.questionpic);
            Drawable drawable = getResources().getDrawable(R.drawable.lion);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.questionsimilarpics);
            ques.setText("FIND THE PAIR OF THIS PICTURE");

            button1 = findViewById(R.id.buttonmonkey);
            button2 = findViewById(R.id.buttonlion);
            button3 = findViewById(R.id.buttonwhale);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, TrueAnswerSimilarPics.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }

        if(a==2){
            ImageView clockIm = findViewById(R.id.questionpic);
            Drawable drawable = getResources().getDrawable(R.drawable.whale);
            clockIm.setImageDrawable(drawable);

            TextView ques = findViewById(R.id.questionsimilarpics);
            ques.setText("FIND THE PAIR OF THIS PICTURE");


            button1 = findViewById(R.id.buttonmonkey);
            button2 = findViewById(R.id.buttonlion);
            button3 = findViewById(R.id.buttonwhale);

            button1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, FalseAnswerSimilarPicsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent detailIntent = new Intent(PlaySimilarPics.this, TrueAnswerSimilarPics.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }

            });


        }



    }
}
