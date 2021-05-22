package com.example.doctor_fyp.Doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.doctor_fyp.R;

public class DocotorSignUp extends AppCompatActivity {
    TextView txt_signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docotor_sign_up);
        txt_signIn=findViewById(R.id.txt_signIn);
        txt_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DocotorSignUp.this,DocotorSignIn.class));
                finish();
            }
        });
    }
}