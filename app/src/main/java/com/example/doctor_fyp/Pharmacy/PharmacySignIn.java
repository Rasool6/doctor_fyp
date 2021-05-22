package com.example.doctor_fyp.Pharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.doctor_fyp.R;
import com.google.android.material.button.MaterialButton;

public class PharmacySignIn extends AppCompatActivity {
    TextView pharmacy_signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_sign_in);
        pharmacy_signInBtn=findViewById(R.id.txt_signup);
        pharmacy_signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(PharmacySignIn.this,PharmacySignUp.class));
            }
        });
    }
}