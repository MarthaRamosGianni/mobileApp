package com.sigbatec.mobileapp.remote;



import com.sigbatec.mobileapp.model.ResObj;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {

    @GET("Autenticacion")
    Call<ResObj> login(@Query("Rut") String Rut,
                       @Query("Password") String Password);
}



