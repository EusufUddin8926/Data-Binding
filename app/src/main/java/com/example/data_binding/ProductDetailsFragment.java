package com.example.data_binding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.data_binding.databinding.FragmentProductDetailsBinding;
import com.example.data_binding.viewmodel.MainActivityViewModel;


public class ProductDetailsFragment extends Fragment {

    FragmentProductDetailsBinding binding;
    MainActivityViewModel mViewModel;

    public ProductDetailsFragment() {
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProductDetailsBinding.inflate(inflater, container, false);


        mViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.setProduct(mViewModel.getProduct());

        return binding.getRoot();
    }
}