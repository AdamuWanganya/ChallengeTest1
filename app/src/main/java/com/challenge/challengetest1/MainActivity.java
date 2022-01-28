package com.challenge.challengetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClickBtn (View view) {
        EditText EditFirstName = findViewById(R.id.EditTxtFirst);
        TextView textViewFirst = findViewById(R.id.textViewFirst);
        textViewFirst.setText( "First Name: " + EditFirstName.getText().toString());

        EditText EditLastName = findViewById(R.id.EditTxtLast);
        TextView txtViewLast = findViewById(R.id.textViewLast);
        txtViewLast.setText( "Last Name: " + EditLastName.getText().toString());

        EditText EditEmail = findViewById(R.id.EditTxtEmail);

        TextView txtEmail = findViewById(R.id.textViewEmail);
        txtEmail.setText("Email: " + EditEmail.getText().toString());





    }
}