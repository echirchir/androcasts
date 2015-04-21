package com.androcasts.androcasts.adapters;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androcasts.androcasts.R;

public class PostViewHolder extends RecyclerView.ViewHolder{

    CardView cardView;
    TextView title;
    TextView author;
    ImageView readIcon;

    public PostViewHolder(View itemView) {
        super(itemView);

        cardView = (CardView)itemView.findViewById(R.id.cv);
        title = (TextView)itemView.findViewById(R.id.post_title);
        author = (TextView)itemView.findViewById(R.id.post_author);
        readIcon = (ImageView)itemView.findViewById(R.id.read_photo);
    }
}
