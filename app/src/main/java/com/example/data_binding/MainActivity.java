package com.example.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.data_binding.databinding.ActivityMainBinding;
import com.example.data_binding.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainActivityViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.setMainActivityViewModel(mViewModel);

        binding.openFragmentBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
            startActivity(intent);
        });


    }
}