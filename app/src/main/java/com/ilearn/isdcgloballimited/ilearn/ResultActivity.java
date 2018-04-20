package com.ilearn.isdcgloballimited.ilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ResultActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        recyclerView = (RecyclerView)findViewById(R.id.recycleCourse);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
