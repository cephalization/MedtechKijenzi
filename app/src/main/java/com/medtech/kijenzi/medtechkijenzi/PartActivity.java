package com.medtech.kijenzi.medtechkijenzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        Intent intent = getIntent();

        // Get part name and display it in the textview
        TextView partName = (TextView) findViewById(R.id.PartNameText);
        partName.setText(intent.getCharSequenceExtra("PART_NAME"));

//        Integer thumbId = intent.getIntExtra("THUMB_ID", -1);
//        Toast thumbToast = Toast.makeText(this, "Thumb id loaded " + thumbId, Toast.LENGTH_LONG);
//        thumbToast.show();
    }
}
