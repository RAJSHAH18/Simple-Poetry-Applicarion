package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PoppupMenu extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poppup_menu_bar);
        btn = findViewById(R.id.click);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu pop = new PopupMenu(PoppupMenu.this,btn);
//                pop.getMenuInflater().inflate(R.menu.popupenu,pop.getMenu());
//                pop.show();
//
//                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        Toast.makeText(PoppupMenu.this,menuItem.getTitle(), Toast.LENGTH_SHORT).show();
//                        return true;
//                    }
//                });
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu pop = new PopupMenu(PoppupMenu.this,btn);
                pop.getMenuInflater().inflate(R.menu.popupenu,pop.getMenu());
                pop.show();

                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        menuItem.getItemId();
                        return false ;
                    }
                });
            }
        });
    }
}