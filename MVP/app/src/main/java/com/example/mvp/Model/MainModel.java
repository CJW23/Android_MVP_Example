package com.example.mvp.Model;

import com.example.mvp.Presenter.Contract;

//Model
public class MainModel {
    Contract.Presenter presenter;
    public MainModel(Contract.Presenter presenter){
        this.presenter = presenter;
    }
}
