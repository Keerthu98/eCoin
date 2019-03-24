package com.example.vicky.e_coin.retrofit;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface IMyservices {
    @POST("register")
    @FormUrlEncoded
    io.reactivex.Observable <String> registerUser(@Field("email") String email,
                                         @Field("name") String name,
                                         @Field("password") String password);

    @POST("login")
    @FormUrlEncoded
    io.reactivex.Observable <String> loginUser(@Field("email") String email,
                                         @Field("password") String password);

    @POST("storedata")
    @FormUrlEncoded
    io.reactivex.Observable <String> storedata(@Field("mobile_number") String mobilenumber,
                                               @Field("upi_id") String upiid,
                                               @Field("balance") String balance,
                                               @Field("pin") String pin,
                                               @Field("email") String email);


    @POST("retrieveupi")
    @FormUrlEncoded
    io.reactivex.Observable <String> retrieveupi(@Field("upi_id") String upiid);

}
