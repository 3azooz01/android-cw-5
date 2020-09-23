package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        Button nextPageBtn = findViewById(R.id.nextPage);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                age.getText().toString();
                Intent x = new Intent(MainActivity.this, MainActivity2.class);
                x.putExtra("name", name.getText().toString());
                x.putExtra("age", age.getText().toString());

                startActivity(x);
            }
        });
    }
}