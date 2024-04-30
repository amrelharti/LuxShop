package com.example.luxshop;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        // Retrieve product details from intent
        String productName = getIntent().getStringExtra("productName");
        int productImageResourceId = getIntent().getIntExtra("productImageResourceId", 0);

        // Set product details in the layout
        ImageView productImageView = findViewById(R.id.productImageView);
        TextView productNameTextView = findViewById(R.id.productNameTextView);

        productImageView.setImageResource(productImageResourceId);
        productNameTextView.setText(productName);
        ;
    }
}