package com.example.worldcinema;

import com.google.gson.JsonArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface Rest {
    //auth
    @POST("/auth/register")
    public Call<User> createUser(@Body User body);

    @POST("/auth/login")
    public Call<User> createUser(@Body User body);

    @GET("/user/auth/{email}")
    public Call<User> getUser(@Path("username") String username);

    //User
    @PUT("user/{username}")
    Call<> putUser(@Path("username") String username, @Body PostModel.Swagger body);

    @DELETE("user/{username}")
    public Call<PostModel.Swagger> delUser(@Path("username") String username);

    @GET("posts/{id}")
    Call<PostModel.Post> getPost(@Path("id") int id);

    @GET("pet/{petId}")
    Call<PetResponse> getPetbyId(@Path("petId") int petId);

    @GET("pet/findByStatus")
    Call<List<PetResponse>> findByStatus(@Query("status") String status);
}
