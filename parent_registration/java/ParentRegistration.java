package com.example.smartvan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ParentRegistration extends AppCompatActivity {
    Spinner spinner;
    CheckBox agree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_registration);
        agree=findViewById(R.id.agreement);
        spinner=findViewById(R.id.spinner);

        ArrayList<String> locationList= new ArrayList<>();
        locationList.add("Select Location :");
        locationList.add("Makola");
        locationList.add("Maabola");
        locationList.add("Kadawatha");

        spinner.setAdapter(new ArrayAdapter<>(ParentRegistration.this,android.R.layout.simple_spinner_dropdown_item,locationList));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"please Select Location",Toast.LENGTH_SHORT).show();
                }
                else{
                    String location=parent.getItemAtPosition(position).toString();
                    Toast.makeText(getApplicationContext(),location,Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}