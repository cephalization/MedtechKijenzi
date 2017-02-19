package com.medtech.kijenzi.medtechkijenzi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by tony on 2/19/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    /**
     * This array needs to be populated with the images on R.drawable,
     * this should be done after the images are renamed
     */
    private Integer[] mThumbsIds = {
            R.drawable.brace, R.drawable.circle,
            R.drawable.clamp, R.drawable.clubfoot_final,
            R.drawable.gearbox, R.drawable.glasses,
            R.drawable.scissors, R.drawable.misc_parts,
            R.drawable.respirator, R.drawable.speculum,
            R.drawable.tweezers
    };

    public int getCount() {
        return mThumbsIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item in the adaptor
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If the view is not recycled, initialize it
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbsIds[position]);
        return imageView;
    }


}

