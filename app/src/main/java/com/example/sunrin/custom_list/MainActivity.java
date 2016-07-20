package com.example.sunrin.custom_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sunrin.custom_list.R;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private Custom adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Custom();
        listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(adapter);

        adapter.add("에베베");
        adapter.add("에에데");
        adapter.add("베에데");
        adapter.add("에123");
        adapter.add("에ㄱㅈㅎㅇ");
        adapter.add("에ㅂㅈㄷ");

    }
}