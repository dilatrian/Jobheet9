package com.example.dlajobsheet9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonProfile = findViewById(R.id.buttonProfile);
        Button buttonStmik = findViewById(R.id.buttonStmik);

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivityLayout.class);
                startActivity(intent);
            }
        });

        buttonStmik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StmikActivity.class);
                startActivity(intent);
            }
        });
    }
}





