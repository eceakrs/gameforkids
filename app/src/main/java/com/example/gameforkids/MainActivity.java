package com.example.gameforkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Game> mGamesData;
    private GamesAdapter mAdapter;
    Toolbar toolbartop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // getSupportActionBar().setTitle();

        //Initialize the RecyclerView
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //Set the Layout Manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Initialize the ArrayLIst that will contain the data
        mGamesData = new ArrayList<>();

        //Initialize the adapter and set it ot the RecyclerView
        mAdapter = new GamesAdapter(this, mGamesData);
        mRecyclerView.setAdapter(mAdapter);

        //Get the data
        initializeData();



    }




    /**
     * Method for initializing the sports data from resources.
     */
    private void initializeData() {
        //Get the resources from the XML file
        String[] gamesList = getResources().getStringArray(R.array.games_titles);
        String[] gamesInfo = getResources().getStringArray(R.array.games_info);
        String[] gamesInstruction = getResources().getStringArray(R.array.subtitle_detail_text);
        String[] videoId = getResources().getStringArray(R.array.video_id_arr);
        TypedArray gamesImageResources = getResources()
                .obtainTypedArray(R.array.games_images);



        //Clear the existing data (to avoid duplication)
        mGamesData.clear();

        //Create the ArrayList of Sports objects with the titles and information about each sport
        for(int i=0;i<gamesList.length;i++){
            mGamesData.add(new Game(gamesList[i],gamesInfo[i], gamesInstruction[i],videoId[i], gamesImageResources.getResourceId(i,0)));
        }

        //recycle the typed array
        gamesImageResources.recycle();

        //Notify the adapter of the change
        mAdapter.notifyDataSetChanged();
    }
    public void resetGames(View view) {
        initializeData();
    }


}