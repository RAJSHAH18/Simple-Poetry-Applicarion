package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewDemo extends AppCompatActivity {
    EditText name;
    Button add,remove;
    ListView lt;
    ArrayList<String> arr;
    ArrayAdapter<String>adp;
    String item ="";
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        name = findViewById(R.id.name);
        add = findViewById(R.id.add);
        remove = findViewById(R.id.remove);
        lt = findViewById(R.id.lt);
        arr.add("Java");
        arr.add("Python");
        adp = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,arr);
        lt.setAdapter(adp);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = name.getText().toString();
                if(text.length()==0 || text==null){
                    Toast.makeText(ListViewDemo.this, "Value Cannot Be Null", Toast.LENGTH_SHORT).show();
                }
                else if(arr.contains(text)){
                    Toast.makeText(ListViewDemo.this, "Value Already present in List", Toast.LENGTH_SHORT).show();
                }
                else{
                    arr.add(text);
                    adp = new ArrayAdapter<>(ListViewDemo.this,android.R.layout.simple_dropdown_item_1line,arr);
                    lt.setAdapter(adp);
                }
            }
        });
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                item = arr.get(i);
                pos = i;
            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr.remove(item);
                Toast.makeText(ListViewDemo.this, "Item Remove Successfully", Toast.LENGTH_SHORT).show();
                adp = new ArrayAdapter<>(ListViewDemo.this, android.R.layout.simple_dropdown_item_1line,arr);
                lt.setAdapter(adp);

            }
        });


    }
}