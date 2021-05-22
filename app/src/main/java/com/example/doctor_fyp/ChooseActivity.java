package com.example.doctor_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.doctor_fyp.Doctor.DocotorSignIn;
import com.example.doctor_fyp.Patient.PatientSignIn;
import com.example.doctor_fyp.Pharmacy.PharmacySignIn;

public class ChooseActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_activity);
         spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       switch (position){
           case 0:

               break;
           case 1:
               startActivity(new Intent(this, DocotorSignIn.class));
               break;
           case 2:
               startActivity(new Intent(this, PatientSignIn.class));
               break;
           case 3:
               startActivity(new Intent(this, PharmacySignIn.class));
               break;

       }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}