package com.example.ltmtk12tcustomizelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ltmtk12tcustomizelistview.adapter.MyAdapter;
import com.example.ltmtk12tcustomizelistview.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvFilms;
    // Du lieu
    private List<Film> dataSource;

    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFilms = findViewById(R.id.lvFilms);
        // Fake du lieu
        dataSource = new ArrayList<>();
        dataSource.add(new Film(1, "Eternal(2021)","Mavel Studio P1","https://upload.wikimedia.org/wikipedia/vi/9/9b/Eternals_%28film%29_poster.jpeg",4.5));
        dataSource.add(new Film(2, "Eternal(2022)","Mavel Studio P2","https://upload.wikimedia.org/wikipedia/vi/9/9b/Eternals_%28film%29_poster.jpeg",4.5));
        dataSource.add(new Film(3, "Eternal(2023)","Mavel Studio P3","https://upload.wikimedia.org/wikipedia/vi/9/9b/Eternals_%28film%29_poster.jpeg",4.5));

        // Tao Adapter
        myAdapter = new MyAdapter(this, dataSource);
        // Set Adapter
        lvFilms.setAdapter(myAdapter);
    }
}