package com.example.doctor_fyp.Patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.doctor_fyp.R;
import com.google.android.material.button.MaterialButton;

public class PatientSignIn extends AppCompatActivity {
    TextView Patient_signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_sign_in);
        Patient_signInBtn=findViewById(R.id.txt_signup);
        Patient_signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientSignIn.this,PatientSignUp.class));
            }
        });
    }
}