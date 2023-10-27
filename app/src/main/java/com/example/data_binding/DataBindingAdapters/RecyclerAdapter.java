package com.example.data_binding.DataBindingAdapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.data_binding.R;
import com.example.data_binding.databinding.ProductItemBinding;
import com.example.data_binding.model.Product;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BindingRecyclerViewHolder> {

    private Context mContext;
    private List<Product> productList;
    ProductItemBinding rootView;


    public RecyclerAdapter(Context mContext, List<Product> productList) {
        this.mContext = mContext;
        this.productList = productList;
    }

    @NonNull
    @Override
    public BindingRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        rootView = ProductItemBinding.inflate(LayoutInflater.from(mContext), parent, false);

        return new BindingRecyclerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull BindingRecyclerViewHolder holder, int position) {
        Product product = productList.get(position);
        rootView.setSingleProduct(product);
        rootView.executePendingBindings();


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class BindingRecyclerViewHolder extends RecyclerView.ViewHolder{

        public BindingRecyclerViewHolder(@NonNull ProductItemBinding itemView) {
            super(itemView.getRoot());
        }
    }
}
