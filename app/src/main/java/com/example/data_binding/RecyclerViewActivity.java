package com.example.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.data_binding.databinding.ActivityRecyclerViewBinding;
import com.example.data_binding.listeners.OnItemClickListener;
import com.example.data_binding.model.Product;
import com.example.data_binding.model.Product_Provider;

public class RecyclerViewActivity extends AppCompatActivity implements OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

       /* binding.setProductList(new Product_Provider().getProductList());*/
        binding.setVariable(BR.productList,new Product_Provider().getProductList());
    }


    @Override
    public void onItemCLick(Product product) {
        Toast.makeText(this, ""+product.getName(), Toast.LENGTH_SHORT).show();
    }
}