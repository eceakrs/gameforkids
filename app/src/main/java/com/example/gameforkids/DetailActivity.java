package com.example.gameforkids;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class DetailActivity extends AppCompatActivity {
    GamesAdapter ga;
   Button button;
    private YouTubePlayerView youTubePlayerView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = findViewById(R.id.buttonplay);
        TextView gamesTitles = findViewById(R.id.titleDetail);
        //   ImageView gamesImage = findViewById(R.id.gamesImageDetail);
        gamesTitles.setText(getIntent().getStringExtra("title"));

        String titles = gamesTitles.getText().toString();

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (titles.equals("Clock Game")){

                    Intent detailIntent = new Intent(DetailActivity.this, PlayClockGame.class);
                   detailIntent.putExtra("title",R.id.titleDetail);
                   detailIntent.putExtra("image", R.id.gamesImageDetail);
                   startActivity(detailIntent);

                }
                if(titles.equals("Seasons Game")){
                    Intent detailIntent = new Intent(DetailActivity.this, PlaySeasonsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if(titles.equals("Days of the Week Game")){
                    Intent detailIntent = new Intent(DetailActivity.this, PlayDaysGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);

                }
                if (titles.equals("Months Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlayMonthsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if (titles.equals("Digit Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlayDigitGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if (titles.equals("Spelling Bee")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlaySpellingBee.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if (titles.equals("Directions Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlayDirectionsGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if (titles.equals("Multiplication Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlayMultiplicationGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }
                if (titles.equals("Similar Pictures Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, PlaySimilarPics.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);

                }
                if (titles.equals("Follow the Ball Game")) {
                    Intent detailIntent = new Intent(DetailActivity.this, TrueAnswerBallGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
                }



            }
                                  });

        youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);

        TextView avatarDesc = findViewById(R.id.avatardescription);
        avatarDesc.setText("Let's watch the video to learn, then click play!");




        ImageView avatarImage = findViewById(R.id.letswatchavatar);
        Drawable drawable = getResources().getDrawable(R.drawable.letswatchavatar);
        avatarImage.setImageDrawable(drawable);

        TextView gamesTitle = findViewById(R.id.titleDetail);
     //   ImageView gamesImage = findViewById(R.id.gamesImageDetail);
        gamesTitle.setText(getIntent().getStringExtra("title"));

        String title = gamesTitle.getText().toString();

     //   Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
        //          .into(gamesImage);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override

            public void onReady(@NonNull YouTubePlayer youTubePlayer) {

                if (title.equals("Clock Game")){
                    String videoId = "EIxaxnageTo";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if(title.equals("Seasons Game")){
                    String videoId = "owppK-GHPTU";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if(title.equals("Days of the Week Game")){
                    String videoId = "xPq1KrYWbqo";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Months Game")) {
                    String videoId = "Fe9bnYRzFvk";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Digit Game")) {
                    String videoId = "t7w3PHgvKJE";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Spelling Bee")) {
                    String videoId = "vwPSswV1O64";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Directions Game")) {
                    String videoId = "DPYJQSA-x50";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Multiplication Game")) {
                    String videoId = "eW2dRLyoyds";
                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (title.equals("Similar Pictures Game")) {
                    String videoId = "6Zd6IObXbW4";
                    youTubePlayer.loadVideo(videoId, 0);

                }
                if (title.equals("Follow the Ball Game")) {
                    String videoId = "DPg0x_nVPXg";
                    youTubePlayer.loadVideo(videoId, 0);
                }

            }
        });


        // Initialize the views.
  //     TextView gamesTitle = findViewById(R.id.titleDetail);
  //      ImageView gamesImage = findViewById(R.id.gamesImageDetail);
//TextView gameInstruction = findViewById(R.id.subtitle_detail_text);
        // Set the text from the Intent extra.
  //     gamesTitle.setText(getIntent().getStringExtra("title"));


        // Load the image using the Glide library and the Intent extra.
   //     Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
     //           .into(gamesImage);
    }
}
