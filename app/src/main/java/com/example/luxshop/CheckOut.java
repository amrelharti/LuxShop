package com.example.luxshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.androidbrowserhelper.playbilling.provider.PaymentActivity;

public class CheckOut extends AppCompatActivity {
    private Button checkoutButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_checkout);
        checkoutButton=findViewById(R.id.checkout_button);
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceedToCheckout();
            }
        });
    }
    private void proceedToCheckout() {
        Toast.makeText(this, "Proceeding to checkout...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }
}
