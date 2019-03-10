package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void calculateTip(View v){
        String totalBillString = ((EditText)findViewById(R.id.totalBillInput)).getText().toString();
        String tipPercentageString = ((EditText)findViewById(R.id.tipPercentageInput)).getText().toString();
        String numPeopleString = ((EditText)findViewById(R.id.numPeopleInput)).getText().toString();

        double totalBill = 0;
        int tipPercentage = 0;
        int numPeople = 1;

        if(!totalBillString.isEmpty())
            totalBill = Double.parseDouble(totalBillString);
        if(!tipPercentageString.isEmpty())
            tipPercentage = Integer.parseInt(tipPercentageString);
        if(!numPeopleString.isEmpty())
            numPeople = Integer.parseInt(numPeopleString);

        if(numPeople > 0){
            double tipTotal = totalBill * tipPercentage / 100;
            double groupTotal = totalBill + tipTotal;
            double individualTotal = groupTotal / numPeople;

            String total = "$" + String.format("%.2f",individualTotal);

            String output = "Cost Per Person: " + total;

            ((TextView)findViewById(R.id.totalOutput)).setText(output);
        }

        /*if((!totalBillString.isEmpty()) && (!tipPercentageString.isEmpty()) && (!numPeopleString.isEmpty())){

            double totalBill = Double.parseDouble(totalBillString);
            int tipPercentage = Integer.parseInt(tipPercentageString);
            int numPeople = Integer.parseInt(numPeopleString);

            if(numPeople > 0){
                double tipTotal = totalBill * tipPercentage / 100;
                double groupTotal = totalBill + tipTotal;
                double individualTotal = groupTotal / numPeople;

                String output = "$" + String.format("%.2f",individualTotal);

                ((TextView)findViewById(R.id.totalOutput)).setText(output);
            }


        }*/
    }
}
