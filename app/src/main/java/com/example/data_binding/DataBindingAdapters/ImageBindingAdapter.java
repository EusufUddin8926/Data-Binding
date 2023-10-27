package com.example.data_binding.DataBindingAdapters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

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

    @BindingAdapter(value = "priceText")
    public static void setPriceText(TextView view, double price){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
        view.setText(formatter.format(price));
    }

    @BindingAdapter(value = "ratingText")
    public static void setratingText(TextView view, float rating){
        view.setText("( "+rating+" )");
    }
}
