package com.example.smartvan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.SecurityPermission;
import java.util.ArrayList;

public class VanOwnerRegister extends AppCompatActivity {

    CheckBox agree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_owner_register);
        agree=findViewById(R.id.agreement);

    }
}