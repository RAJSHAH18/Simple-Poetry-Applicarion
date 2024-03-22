package com.example.poetry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class RegistrationActivity extends AppCompatActivity {
    EditText name,pass,phn;
    RadioGroup rg;
    RadioButton male,female,ans;
    Spinner cities;
    CheckBox en,guj,hin;
    Button click;
    String gen="",lang="" ,city="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.password);
        phn = findViewById(R.id.phone);
        rg = findViewById(R.id.rd);
        male = findViewById(R.id.radioButton);
        female = findViewById(R.id.radioButton3);
        cities = findViewById(R.id.spinner);
        en = findViewById(R.id.english);
        hin = findViewById(R.id.hindi);
        guj = findViewById(R.id.guj);
        click = findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this,HomeActivity.class);
                startActivity(intent);


//                Radio Button
                int radioId = rg.getCheckedRadioButtonId();
                ans  = findViewById(radioId);
                gen = ans.getText().toString();


//                Checkbox

                if(en.isChecked()){
                    lang+=en.getText().toString()+" ";
                }
                if(hin.isChecked()){
                    lang+=hin.getText().toString()+" ";
                }
                if(guj.isChecked()){
                    lang+=guj.getText().toString()+" ";

                }
//                Spinner

                city = cities.getSelectedItem().toString();

                intent.putExtra("Nm", name.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                intent.putExtra("phn",phn.getText().toString());
                intent.putExtra("gender",gen);
                intent.putExtra("gender",gen);

            }
        });



    }
}