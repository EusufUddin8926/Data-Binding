package com.example.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.data_binding.DataBindingAdapters.RecyclerAdapter;
import com.example.data_binding.databinding.ActivityRecyclerViewBinding;
import com.example.data_binding.model.Product;
import com.example.data_binding.model.Product_Provider;
import com.example.data_binding.viewmodel.MainActivityViewModel;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

        recyclerAdapter = new RecyclerAdapter(RecyclerViewActivity.this,  new Product_Provider().getProductList());
        binding.recyclerViewBinding.setLayoutManager(new GridLayoutManager(this, 2));
        binding.recyclerViewBinding.setAdapter(recyclerAdapter);
    }
}