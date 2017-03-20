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
        ArrayList<PartInfo> partsListTemp = new ArrayList<PartInfo>();

        PartInfo brace = new PartInfo("Brace", R.drawable.brace, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(brace);

        PartInfo circle = new PartInfo("Circle", R.drawable.circle, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(circle);

        PartInfo clamp = new PartInfo("Clamp", R.drawable.clamp, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(clamp);

        PartInfo clubfoot_final = new PartInfo("Clubfoot", R.drawable.clubfoot_final, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(clubfoot_final);

        PartInfo gearbox = new PartInfo("Gearbox", R.drawable.gearbox, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(gearbox);

        PartInfo glasses = new PartInfo("Glasses", R.drawable.glasses, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(glasses);

        PartInfo scissors = new PartInfo("Scissors", R.drawable.scissors, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(scissors);

        PartInfo misc_parts = new PartInfo("Misc", R.drawable.misc_parts, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(misc_parts);

        PartInfo respirator = new PartInfo("Respirator", R.drawable.respirator, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(respirator);

        PartInfo speculum = new PartInfo("Speculum", R.drawable.speculum, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(speculum);

        PartInfo tweezers = new PartInfo("Tweezers", R.drawable.tweezers, "gcode", "Fix fer yer arm when it booboo");
        partsListTemp.add(tweezers);

        final ArrayList<PartInfo> partsList = partsListTemp;

        mainGrid.setAdapter(new ImageAdapter(this, partsList));
        final Context context = getBaseContext();
        mainGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context, PartActivity.class);
                intent.putExtra("THUMB_ID", partsList.get(i).getThumbId());
                intent.putExtra("PART_NAME", partsList.get(i).getPartName());
                intent.putExtra("GCODE", partsList.get(i).getGcode());
                intent.putExtra("DESCRIPTION", partsList.get(i).getDescription());
                startActivity(intent);

            }
        });
    }
}
