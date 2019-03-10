package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TempConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
    }

    public void convertTemp(View v){

        String fahrenheit = ((EditText)findViewById(R.id.fInput)).getText().toString();
        String celsius = ((EditText)findViewById(R.id.cInput)).getText().toString();

        if(fahrenheit.isEmpty()){
            if(!celsius.isEmpty()){
                double c = Double.parseDouble(celsius);
                double f = ((c * 9 / 5) + 32);

                ((EditText) findViewById(R.id.fInput)).setText(Double.toString(f));
            }
        }
        else{
            double f = Double.parseDouble(fahrenheit);
            double c = ((f - 32) * 5 / 9);

            ((EditText)findViewById(R.id.cInput)).setText(Double.toString(c));
        }


    }
}
