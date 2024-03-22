package com.example.poetry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContextMenuBarDemo extends AppCompatActivity {

    ListView lt;
    String []contacts ={"Deepak","Amit","Rahul","Kamal","Deepesh"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar_demo);
        lt =(ListView) findViewById(R.id.conlist);
        adp = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,contacts);
        lt.setAdapter(adp);
        registerForContextMenu(lt);


    }
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        getMenuInflater().inflate(R.menu.contextlist,menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        return super.onContextItemSelected(item);
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextlist,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }

    SharedPreferences sp = getSharedPreferences("mypref",MODE_PRIVATE);
    SharedPreferences.Editor ed = sp.edit();

}