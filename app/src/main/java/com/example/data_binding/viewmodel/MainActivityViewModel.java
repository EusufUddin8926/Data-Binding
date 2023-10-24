package com.example.data_binding.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.data_binding.model.Person;
import com.example.data_binding.model.Product;
import com.example.data_binding.model.Product_Provider;

public class MainActivityViewModel extends AndroidViewModel {
    private Person mPerson;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mPerson = new Person("Yusuf Uddin", 28);

    }

    private Product product = new Product_Provider().getProductList().get(4);
    public  Product getProduct(){
        return product;
    }
    public Person getPerson(){
        return  this.mPerson;
    }
}
