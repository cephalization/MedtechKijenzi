package com.medtech.kijenzi.medtechkijenzi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView mainGrid = (GridView) findViewById(R.id.gridview);

        // Statically define list of parts
        List<PartInfo> partsList = new ArrayList<PartInfo>();
        PartInfo brace = new PartInfo("Brace", R.drawable.brace, "gcode", "Fix fer yer arm when it booboo");


        mainGrid.setAdapter(new ImageAdapter(this));
        final Context context = getBaseContext();
        mainGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context, PartActivity.class);
                startActivity(intent);
            }
        });
    }
}
