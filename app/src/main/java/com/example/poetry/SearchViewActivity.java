package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {
    SearchView search;
    ListView lt;
    ArrayList<String> names;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        search = findViewById(R.id.search);
        lt= findViewById(R.id.list);
        names = new ArrayList<>();
        names.add("R  ");
        names.add("deepak");
        names.add("deepali");
        names.add("kayak");
        names.add("amit");
        names.add("Rueful");

        ArrayAdapter<String>  adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);

                return false;
            }
        });

        web = findViewById(R.id.web);
        web.loadUrl("https://wwww.google.com");


    }
}