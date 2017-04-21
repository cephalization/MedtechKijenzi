package com.medtech.kijenzi.medtechkijenzi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class PartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        Intent intent = getIntent();

        // Get part name and display it in the textview
        TextView partName = (TextView) findViewById(R.id.PartNameText);
        partName.setText(intent.getCharSequenceExtra("PART_NAME"));

        // Get part description and display it in the textview
        TextView description = (TextView) findViewById(R.id.DescriptionText);
        description.setText(intent.getCharSequenceExtra("DESCRIPTION"));

        Button printButton = (Button) findViewById(R.id.PrintButton);
        final Context context = getBaseContext();
        printButton.setText("Print");
        printButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent printClick = new Intent(context, PrintActivity.class);
                printClick.putExtra("GCODE", "GCODE");
                startActivity(printClick);
            }
        });

//        Integer thumbId = intent.getIntExtra("THUMB_ID", -1);
//        Toast thumbToast = Toast.makeText(this, "Thumb id loaded " + thumbId, Toast.LENGTH_LONG);
//        thumbToast.show();
    }
}
