package com.sigbatec.mobileapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResObjValidateNumber {

    @SerializedName("rut")
    @Expose
    private String rut;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("id_conductor")
    @Expose
    private int idConductor;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }
}
