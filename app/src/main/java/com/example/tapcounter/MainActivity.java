package com.example.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = findViewById(R.id.increase);
        Button b = findViewById(R.id.decrease);
        TextView textView = findViewById(R.id.num);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                textView.setText(Integer.toString(i));

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                textView.setText(Integer.toString(i));

            }
        });
    }
}