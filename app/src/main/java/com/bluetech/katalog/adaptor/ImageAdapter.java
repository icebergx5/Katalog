package com.bluetech.katalog.adaptor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;

import com.bluetech.katalog.R;

import java.io.File;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private File[] elements;


    public ImageAdapter(Context c, String menuName) {
        mContext = c;

        File directory = new File(menuName);
        elements = directory.listFiles();

        Log.d("YAS", "File lenghts: "+elements.length);
        for (int i = 0; i < elements.length; i++) {

        }

    }

    public int getCount() {
        return elements.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

            Bitmap bMap = BitmapFactory.decodeFile(elements[position].getAbsolutePath());
            imageView.setImageBitmap(bMap);


        } else {
            imageView = (ImageView) convertView;
        }

       // imageView.setImageResource(mThumbIds[position]);
/*
        Bitmap bMap = BitmapFactory.decodeFile("");
        imageView.setImageBitmap(bMap);
*/
        return imageView;
    }

    private Integer[] listIds;

    private Integer[] mThumbIds = null;

/*
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
    */
}