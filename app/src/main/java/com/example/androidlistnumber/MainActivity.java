package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewList;
    ListNumberAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] number = new int[100];

        recyclerViewList = findViewById(R.id.recyclerview);
        recyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        listAdapter = new ListNumberAdapter(this, number);
        recyclerViewList.setAdapter(listAdapter);
    }
}
