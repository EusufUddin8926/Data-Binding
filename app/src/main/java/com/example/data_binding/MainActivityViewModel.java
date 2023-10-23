package com.example.data_binding;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
    private Person mPerson;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mPerson = new Person("Yusuf Uddin", 26);
    }

    public Person getPerson(){
        return  this.mPerson;
    }
}
