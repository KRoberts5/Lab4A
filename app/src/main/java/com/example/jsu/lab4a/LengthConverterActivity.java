package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LengthConverterActivity extends AppCompatActivity {

    public static final double KM_TO_MILE = 0.6214;
    public static final double MILE_TO_KM = 1.609;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);
    }

    public void convertLength(View v){
        String miles = ((EditText)findViewById(R.id.mileInput)).getText().toString();
        String kilometers = ((EditText)findViewById(R.id.kilometerInput)).getText().toString();

        if(miles.isEmpty()){
            if(!kilometers.isEmpty()){
                double k = Double.parseDouble(kilometers);
                double m = k * KM_TO_MILE;

                ((EditText)findViewById(R.id.mileInput)).setText(Double.toString(m));
            }
        }
        else{
            double m = Double.parseDouble(miles);
            double k = m * MILE_TO_KM;

            ((EditText)findViewById(R.id.kilometerInput)).setText(Double.toString(k));
        }
    }
}
