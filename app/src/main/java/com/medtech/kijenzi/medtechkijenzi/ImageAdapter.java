package com.medtech.kijenzi.medtechkijenzi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by tony on 2/19/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<PartInfo> parts;

    public ImageAdapter(Context c, ArrayList<PartInfo> parts) {
        mContext = c;
        this.parts = parts;
    }

    /**
     * Retrieve the number of parts loaded into the ImageAdapter
     * @return
     */
    public int getCount() {
        return parts.size();
    }

    /**
     * Retrieve the PartInfo at a given location
     * @param position
     * @return
     */
    public PartInfo getItem(int position) {
        return parts.get(position);
    }

    /**
     * Provide ImageAdapter with a new list of par
     * @param parts
     */
    public void updateParts(ArrayList<PartInfo> parts) { this.parts = parts;}

    /**
     * OVERLOADED FUNCTION, NO USE RIGHT NOW
     * @param position
     * @return
     */
    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item in the adaptor
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        PartInfo part = parts.get(position);
        if (convertView == null) {
            // If the view is not recycled, initialize it
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(part.getThumbId());
        return imageView;
    }


}

