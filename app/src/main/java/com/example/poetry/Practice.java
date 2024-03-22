package com.example.poetry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if(item_id == R.id.home){
            Toast.makeText(this, "Home is CLicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item_id == R.id.logout){
            Toast.makeText(this, "Logout Successfully", Toast.LENGTH_SHORT).show();
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);

        }

    }
}