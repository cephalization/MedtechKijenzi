package com.medtech.kijenzi.medtechkijenzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        Intent intent = getIntent();
        Integer thumbId = intent.getIntExtra("THUMB_ID", -1);
        System.out.println("Thumb id loaded" + thumbId);
    }
}
