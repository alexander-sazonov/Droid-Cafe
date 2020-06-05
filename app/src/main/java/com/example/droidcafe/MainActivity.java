package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }

    public void orderDonut(View view) {
        displayToast(getString(R.string.donut_order_string));

    }

    public void orderIceCream(View view) {
        displayToast(getString(R.string.icecream_order_string));

    }

    public void froyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_string));
    }
}