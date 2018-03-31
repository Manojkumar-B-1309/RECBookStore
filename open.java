package com.example.koushikraghav.recbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class open extends AppCompatActivity {
    Button AI;
    Button MC;
    Button CN;
    Button CD;
    Button DSP;
    Button DS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        AI=(Button) findViewById(R.id.AI);
        MC=(Button) findViewById(R.id.MC);
        CD=(Button) findViewById(R.id.CD);
        CN=(Button) findViewById(R.id.CN);
        DSP=(Button) findViewById(R.id.DSP);
        DS=(Button) findViewById(R.id.DS);

        AI.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1_YIHgdhNqLKg03kU0OjIX4kpMI6K6fUQ?usp=sharing");


            }
        });
        MC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1iFTV-VIVoh4Ty-gSrlDqmIZWIxL5rmmO?usp=sharing");


            }
        });
        CN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1Ul_N1ki2PcMF9QtYSDN8goiyPwcufmH0?usp=sharing");


            }
        });
        CD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1MIk1EWZ5ftCFrEB4gwRbnf_wBObEUcB1?usp=sharing");


            }
        });
        DSP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1jtgM_a7gLbEmjQoGqbMcy7bS1HR99-ud?usp=sharing");


            }
        });
        DS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUrl ("https://drive.google.com/drive/folders/1tl0Do0CFAbv4l2OuGyCDfP4weg-m_P4-?usp=sharing");


            }
        });

    }

    private void goToUrl(String url) {
        Uri uriUrl=Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
