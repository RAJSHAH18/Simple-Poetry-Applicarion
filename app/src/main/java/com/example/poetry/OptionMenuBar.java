package com.example.poetry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_bar);
    }

    @Override

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.option_menubars,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int item_id = item.getItemId();
//
//        switch(item_id){
//            case R.id.option_one:
//                Toast.makeText(this, "Option 1 Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.option_two:
//                Toast.makeText(this, "Option 2 Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.option_three:
//                Toast.makeText(this, "Option e Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//
//        }
//    }



}
