package com.example.luxshop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView textViewOrderHistory;
    private ListView listViewOrderHistory;
    private TextView textViewAccountSettings;
    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textViewOrderHistory = findViewById(R.id.textViewOrderHistory);
        listViewOrderHistory = findViewById(R.id.listViewOrderHistory);
        textViewAccountSettings = findViewById(R.id.textViewAccountSettings);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonUpdate = findViewById(R.id.buttonUpdate);

  }
}
