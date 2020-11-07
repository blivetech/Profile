package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.profile.adapter.MyListAdapter;
import com.example.profile.pojo.MyListData;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity   {
    private TabLayout tabLayout;
     int[] tabIcons = {
            R.drawable.video,
            R.drawable.like,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("");


            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        

        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Info", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Delete", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Dialer", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Alert", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Map", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Email", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Info", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Delete", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Dialer", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Alert", R.drawable.usertest,"DScFlfN9vDk"),
                new MyListData("Map", R.drawable.usertest,"DScFlfN9vDk"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
     //   recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}