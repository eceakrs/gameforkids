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


public class PlayBallGame extends AppCompatActivity {
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

                    Intent detailIntent = new Intent(PlayBallGame.this, TrueAnswerBallGame.class);
                    detailIntent.putExtra("title",R.id.titleDetail);
                    detailIntent.putExtra("image", R.id.gamesImageDetail);
                    startActivity(detailIntent);
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


                    String videoId = "DPg0x_nVPXg";
                    youTubePlayer.loadVideo(videoId, 0);
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
