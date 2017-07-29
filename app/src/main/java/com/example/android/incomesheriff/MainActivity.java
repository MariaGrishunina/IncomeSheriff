package com.example.android.incomesheriff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      OnClick(R.id.addButton, new View.OnClickListener() {
          public void onClick(View v) {
              Intent myIntent = new Intent(MainActivity.this, CalculatorActivity.class);
              MainActivity.this.startActivity(myIntent);
          }
      });

        OnClick(R.id.subtractButton, new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }

    private void OnClick(int id, View.OnClickListener listener) {
        final Button button = (Button)findViewById(id);
        button.setOnClickListener(listener);
    }
}
