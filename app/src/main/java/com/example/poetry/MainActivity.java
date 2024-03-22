package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lineOne,lineTwo;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lineOne = findViewById(R.id.lineOne);
        lineTwo = findViewById(R.id.lineTwo);
        btn = findViewById(R.id.share);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String share1 = lineOne.getText().toString();
                String share2 = lineTwo.getText().toString();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,share1+"\n"+share2);
                startActivity(intent);

            }
        });
    }
}