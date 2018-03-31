package com.example.koushikraghav.recbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etuname,etpassword;
    Button btlogin,btregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etuname = (EditText) findViewById(R.id.ETuname);
        etpassword = (EditText) findViewById(R.id.ETPass);
        btlogin = (Button)findViewById(R.id.BTNLogin);
        btregister= (Button) findViewById(R.id.BTNRegister);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String struname,strpass,strpass2;
                struname = etuname.getText().toString();
                strpass = etpassword.getText().toString();
                strpass2=getIntent().getStringExtra("Password");
                if(strpass.equals(strpass2)) {
                    Intent intent = new Intent(MainActivity.this, open.class);
                    intent.putExtra("Username", struname);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this,"Password Not Match",Toast.LENGTH_LONG).show();
            }
        });
        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });
    }
}

