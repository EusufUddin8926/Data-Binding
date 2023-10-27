package com.example.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.data_binding.adapter.RecyclerAdapter;
import com.example.data_binding.databinding.ActivityRecyclerViewBinding;
import com.example.data_binding.model.Product_Provider;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

       /* binding.setProductList(new Product_Provider().getProductList());*/
        binding.setVariable(BR.productList,new Product_Provider().getProductList());
    }
}