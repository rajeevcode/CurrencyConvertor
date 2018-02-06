package com.rajeevkumar.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view){

        EditText thaiBhaiAmountEditText = (EditText) findViewById(R.id.thaiBhaiAmountEditText);

        Double thaiBhatAmountDouble = Double.parseDouble(thaiBhaiAmountEditText.getText().toString());

        Double indianRuppeeAmountDouble = thaiBhatAmountDouble * 2.03;

        Toast.makeText(MainActivity.this, thaiBhatAmountDouble + " Thai Bhat is Rs. " + indianRuppeeAmountDouble.toString(), Toast.LENGTH_SHORT).show();

        Log.i("amount", thaiBhaiAmountEditText.getText().toString());
        //git config --global user.email "rajeev.code@gmail.com"
        //git config --global user.name "Rajeev Kumar"

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
