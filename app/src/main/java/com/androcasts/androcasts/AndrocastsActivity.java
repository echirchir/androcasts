package com.androcasts.androcasts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.androcasts.androcasts.adapters.BlogPostsAdapter;
import com.androcasts.androcasts.model.BlogPost;

import java.util.ArrayList;
import java.util.List;


public class AndrocastsActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private RecyclerView recycler;
    private LinearLayoutManager llm;
    private List<BlogPost> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.core_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recycler = (RecyclerView)findViewById(R.id.recycler);

        recycler.setHasFixedSize(true);

        llm = new LinearLayoutManager(this);

        recycler.setItemAnimator(new DefaultItemAnimator());

        recycler.setLayoutManager(llm);

        initializeData();

        BlogPostsAdapter adapter = new BlogPostsAdapter(posts);

        recycler.setAdapter(adapter);

    }

    private void initializeData(){
        posts = new ArrayList<>();

        posts.add(new BlogPost("Introduction to Android", "by elisha chirchir", R.drawable.read));
        posts.add(new BlogPost("How to use Retrofit Library", "by elisha chirchir", R.drawable.read));
        posts.add(new BlogPost("Introduction to Java Language", "by elisha chirchir", R.drawable.read));
        posts.add(new BlogPost("Android Testing Frameworks", "by elisha chirchir", R.drawable.read));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.core_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
