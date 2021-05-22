package com.example.doctor_fyp.Doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.doctor_fyp.R;
import com.google.android.material.button.MaterialButton;

public class DocotorSignIn extends AppCompatActivity {
    TextView Docotor_signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docotor_sign_in);
        Docotor_signUpBtn=findViewById(R.id.txt_signup);

        Docotor_signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DocotorSignIn.this,DocotorSignUp.class));
            }
        });
    }
}