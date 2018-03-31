package com.example.htd.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText etname,etuname,etpass,etpass2;
    Button btregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etname = (EditText) findViewById(R.id.etRName);
        etuname = (EditText) findViewById(R.id.etRuname);
        etpass = (EditText) findViewById(R.id.etRPass);
        etpass2 = (EditText) findViewById(R.id.etRPass2);

        btregister = (Button) findViewById(R.id.btRegister);

        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpass,strpass2;
                strpass = etpass.getText().toString();
                strpass2 = etpass2.getText().toString();
                if(strpass.equals(strpass2))
                {
                    Toast.makeText(Register.this,"Password Match",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this,MainActivity.class);
                    intent.putExtra("Password",strpass);
                    startActivity(intent);
                }
                else
                Toast.makeText(Register.this,"Password Not Match",Toast.LENGTH_SHORT).show();
            }
        });
    }
}



