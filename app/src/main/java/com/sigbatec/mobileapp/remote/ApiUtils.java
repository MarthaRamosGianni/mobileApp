package com.sigbatec.mobileapp.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://134.209.55.111/ConexionAndroid/";


    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }

    public static RutService getRutService(){
        return RetrofitClient.getClient(BASE_URL).create(RutService.class);
    }

    public static RegisterService getRegisterService(){
        return RetrofitClient.getClient(BASE_URL).create(RegisterService.class);
    }
}
