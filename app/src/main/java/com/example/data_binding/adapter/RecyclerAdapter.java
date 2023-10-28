package com.example.data_binding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;

import com.example.data_binding.databinding.ProductItemBinding;
import com.example.data_binding.model.Product;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BindingRecyclerViewHolder> {

    private Context mContext;
    private List<Product> productList;
   /* ProductItemBinding rootView;*/
    ViewDataBinding rootView;


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
        /*rootView.setSingleProduct(product);*/
        rootView.setVariable(BR.singleProduct, product);
        rootView.setVariable(BR.recyclerItemClick, mContext);
        rootView.executePendingBindings();


    }

    public void ItemOnClick(View view){
        Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class BindingRecyclerViewHolder extends RecyclerView.ViewHolder{

        public BindingRecyclerViewHolder(@NonNull /*ProductItemBinding itemView*/ViewDataBinding itemView) {
            super(itemView.getRoot());
        }
    }
}
