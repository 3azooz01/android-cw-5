package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt = findViewById(R.id.info2Txt2);
        Button b = findViewById(R.id.button);

        Bundle information = getIntent().getExtras();

        String ism = information.getString("name");
        String amr = information.getString("age");

        txt.setText(ism + "      " + amr);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(x);
            }
        });



    }
}