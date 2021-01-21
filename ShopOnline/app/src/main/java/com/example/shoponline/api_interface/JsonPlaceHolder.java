package com.example.shoponline.api_interface;


import com.example.shoponline.R_Models.CreateCart;
import com.example.shoponline.R_Models.ViewCart;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface JsonPlaceHolder {


    @POST("addCart")
    Call<CreateCart> SendCart(@Body CreateCart user_cart);

    @POST("viewCart")
    Call<List<CreateCart>> View_Cart(@Body ViewCart user_cart_view);



}
