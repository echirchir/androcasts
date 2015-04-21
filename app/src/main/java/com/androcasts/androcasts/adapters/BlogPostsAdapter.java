package com.androcasts.androcasts.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androcasts.androcasts.R;
import com.androcasts.androcasts.model.BlogPost;

import java.util.List;


public class BlogPostsAdapter extends RecyclerView.Adapter<PostViewHolder> {

    List<BlogPost> posts;

    public BlogPostsAdapter(List<BlogPost> blogPosts){
        this.posts = blogPosts;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_post_card, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.title.setText(posts.get(position).title);
        holder.author.setText(posts.get(position).author);
        holder.readIcon.setImageResource(posts.get(position).readIcon);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
