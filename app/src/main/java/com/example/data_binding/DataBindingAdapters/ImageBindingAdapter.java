package com.example.data_binding.DataBindingAdapters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import java.io.IOException;

import kotlin.jvm.JvmStatic;

public class ImageBindingAdapter {

    @BindingAdapter("setImageFromDrawable")
    public static void setImage(ImageView view, String imageName){
        try {
            Bitmap bitmap = BitmapFactory.decodeStream(view.getContext().getResources().getAssets().open(imageName));
            view.setImageBitmap(bitmap);
        }catch (IOException e){
            Log.d("TAGCalled", "setImage: Called");
            e.printStackTrace();
        }
    }
}
