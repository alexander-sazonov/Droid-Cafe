package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

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

    public void openBasket(View view) {
        Intent intent = new Intent(MainActivity.this,BasketActivity.class);
        startActivity(intent);
    }
}