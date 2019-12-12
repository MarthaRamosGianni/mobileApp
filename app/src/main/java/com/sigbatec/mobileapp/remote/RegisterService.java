package com.sigbatec.mobileapp.remote;


import com.sigbatec.mobileapp.model.ResObjRegisterDriver;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RegisterService {

    @GET("Register")
    Call<ResObjRegisterDriver> RegisterDriver(@Query("Rut") String Rut,
                                              @Query("Password") String Password,
                                              @Query("id_conductor") int id_conductor);
}
