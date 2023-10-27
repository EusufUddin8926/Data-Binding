package com.example.data_binding.DataBindingAdapters;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.data_binding.adapter.RecyclerAdapter;
import com.example.data_binding.model.Product;

import java.util.List;

public class RecyclerViewBinding {

    @BindingAdapter("bindingList")
    public static void bindingRecyclerViewList(RecyclerView view, List<Product> productList){

        if (productList.isEmpty()){
            return;
        }
        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if (layoutManager==null){
            view.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        }

        RecyclerView.Adapter adapter = view.getAdapter();
        if (adapter==null){
            view.setAdapter(new RecyclerAdapter(view.getContext(), productList));
        }

    }
}
