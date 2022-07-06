package com.example.gameforkids;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder>  {


    //Member variables
    private ArrayList<Game> mGamesData;
    private Context mContext;

    /**
     * Constructor that passes in the sports data and the context
     * @param gamesData ArrayList containing the sports data
     * @param context Context of the application
     */
    GamesAdapter(Context context, ArrayList<Game> gamesData) {
        this.mGamesData = gamesData;
        this.mContext = context;
    }


    /**
     * Required method for creating the viewholder objects.
     * @param parent The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param viewType The view type of the new View.
     * @return The newly create ViewHolder.
     */
    @Override
    public GamesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
    }

    /**
     * Required method that binds the data to the viewholder.
     * @param holder The viewholder into which the data should be put.
     * @param position The adapter position.
     */
    @Override
    public void onBindViewHolder(GamesAdapter.ViewHolder holder, int position) {
        //Get current sport
        Game currentGame = mGamesData.get(position);
        //Populate the textviews with data
        holder.bindTo(currentGame);
    }


    /**
     * Required method for determining the size of the data set.
     * @return Size of the data set.
     */
    @Override
    public int getItemCount() {
        return mGamesData.size();
    }


    /**
     * ViewHolder class that represents each row of data in the RecyclerView
     */
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        //Member Variables for the TextViews
        private TextView mTitleText;
        private TextView mInfoText;
        private TextView mInstructionText;
        private ImageView mGamesImage;

        /**
         * Constructor for the ViewHolder, used in onCreateViewHolder().
         * @param itemView The rootview of the list_item.xml layout file
         */
        ViewHolder(View itemView) {
            super(itemView);

            //Initialize the views
            mTitleText = (TextView)itemView.findViewById(R.id.title);
            mInfoText = (TextView)itemView.findViewById(R.id.subTitle);
            mInstructionText = itemView.findViewById(R.id.subtitle_detail_text);
            mGamesImage = itemView.findViewById(R.id.gamesImage);

            itemView.setOnClickListener(this);

        }

        void bindTo(Game currentGame){
            //Populate the textviews with data
            mTitleText.setText(currentGame.getTitle());
            mInfoText.setText(currentGame.getInfo());
            mInstructionText.setText(currentGame.getInstruction());

            Glide.with(mContext).load(currentGame.getImageResource()).into(mGamesImage);

        }

        public void onClick(View view){
            Game currentGame = mGamesData.get(getAdapterPosition());
            Intent detailIntent = new Intent(mContext, DetailActivity.class);
            detailIntent.putExtra("videoid", currentGame.getVideoId());
            detailIntent.putExtra("title", currentGame.getTitle());
           detailIntent.putExtra("Instruction", currentGame.getInstruction());
            detailIntent.putExtra("image_resource",
                    currentGame.getImageResource());


            mContext.startActivity(detailIntent);
        }
    }
}