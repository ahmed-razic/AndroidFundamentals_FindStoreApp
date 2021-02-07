package com.example.android.findstoreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText storeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storeName = findViewById(R.id.store_name_editText);

    }

    public void findStore(View view) {
        String address = "geo:0,0?q=" + storeName.getText().toString();
        Uri addressUri = Uri.parse(address);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);

/*        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Do not work", Toast.LENGTH_LONG).show();
        }*/
    }
}


/*
    public void findStore(View view) {
        String loc = storeName.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        startActivity(intent);
    }*/
