package com.sigbatec.mobileapp.remote;



import com.sigbatec.mobileapp.model.ResObjValidateNumber;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RutService {

    @GET("ValidateDocumentNumber")
    Call<ResObjValidateNumber> ValidateDocument(@Query("rut") String rut);


}
