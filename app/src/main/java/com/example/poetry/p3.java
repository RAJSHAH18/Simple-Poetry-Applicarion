package com.example.poetry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class p3 extends AppCompatActivity {
    ListView lt;
    String[] contacts = {"Raj","Rahul","Rajvi","Rahil"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        lt = findViewById(R.id.lt);
        adp =new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,contacts);
        registerForContextMenu(lt);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextlist,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}