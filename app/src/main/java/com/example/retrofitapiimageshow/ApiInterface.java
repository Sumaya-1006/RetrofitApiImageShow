package com.example.retrofitapiimageshow;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("users")
    Call<Pojo> getPost();

}
