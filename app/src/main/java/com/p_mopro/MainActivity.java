package com.p_mopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.game,"Gaming Content","Disini kamu akan mendapatkan tips and trick soal game"));
        exampleList.add(new ExampleItem(R.drawable.design,"Design Content","Disini kamu akan mendapatkan tips and trick soal design"));
        exampleList.add(new ExampleItem(R.drawable.drama,"Drama Content","Disini kamu akan mendapatkan tips and trick soal drama"));
        exampleList.add(new ExampleItem(R.drawable.travel,"Travel Content","Disini kamu akan mendapatkan tips and trick soal travel"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Segera Hadir","Koneten segera hadir"));


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item1) {
            Intent in1 = new Intent(getApplicationContext(),Profil.class);
            startActivity(in1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
