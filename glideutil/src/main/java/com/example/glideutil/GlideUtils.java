package com.example.glideutil;


import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideUtils {
    public static void setGlide(Activity activity, String url, ImageView imageView){
        Glide.with(activity)
                .load(url)
                .into(imageView);
    }
}
