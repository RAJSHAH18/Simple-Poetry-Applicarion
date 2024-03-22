package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        String capitals[]={"Delhi","Mumbai","Surat","Ahemdabad","Patna","Chennai"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_dropdown_item_1line,capitals);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "Clicked"+capitals[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}