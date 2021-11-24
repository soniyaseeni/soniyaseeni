package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;


public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);
        tx1 = (TextView) findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            private Intent intent;
            private String activity_main;

            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("peoplelink") &&
                        ed2.getText().toString().equals("peoplelink")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                }


                b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });


            final Button b1 = (Button) findViewById(R.id.button);

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent;
                            intent = (new Intent(MainActivity.this, MainActivity2.class));
                            startActivity(intent);


                        }        });

                }
            });

        }



    }

