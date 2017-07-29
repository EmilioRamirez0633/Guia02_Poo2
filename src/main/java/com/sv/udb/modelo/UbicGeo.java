/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Estudiante
 */
public class UbicGeo {
    private int codi;
    private String nombUbic;
    private int codiUbiSupe;
    private String fechAlta;
    private String fechBaja;

    public UbicGeo() {
    }

    public UbicGeo(int codi, String nombUbic, int codiUbiSupe, String fechAlta, String fechBaja) {
        this.codi = codi;
        this.nombUbic = nombUbic;
        this.codiUbiSupe = codiUbiSupe;
        this.fechAlta = fechAlta;
        this.fechBaja = fechBaja;
    }

    public UbicGeo(int codi, String nombUbic) {
        this.codi = codi;
        this.nombUbic = nombUbic;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNombUbic() {
        return nombUbic;
    }

    public void setNombUbic(String nombUbic) {
        this.nombUbic = nombUbic;
    }

    public int getCodiUbiSupe() {
        return codiUbiSupe;
    }

    public void setCodiUbiSupe(int codiUbiSupe) {
        this.codiUbiSupe = codiUbiSupe;
    }

    public String getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(String fechAlta) {
        this.fechAlta = fechAlta;
    }

    public String getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(String fechBaja) {
        this.fechBaja = fechBaja;
    }
    
    
}
