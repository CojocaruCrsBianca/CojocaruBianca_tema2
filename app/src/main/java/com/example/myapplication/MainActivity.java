package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
     MyRecyclerViewAdapter adapter;



    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    MyRecyclerViewAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(mLayoutManager);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView = (RecyclerView) findViewById(R.id.my_recycler_view);
        //mAdapter = new MyAdapter(myDataset);
        //mRecycleView.setAdapter(mAdapter);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        // set up the RecyclerView
      // RecyclerView recyclerView = findViewById(R.id.rvAnimals);
       recyclerView = recyclerView.findViewById(R.id.tvAnimalName);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
         adapter.setClickListener((MyRecyclerViewAdapter.ItemClickListener) this);
        recyclerView.setAdapter(adapter);


    }
}
