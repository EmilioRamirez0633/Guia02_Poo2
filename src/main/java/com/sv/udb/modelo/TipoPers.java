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
public class TipoPers {
    private int codiTipo;
    private String nombTipo;
    private String fechAlta;
    private String fechBaja;
    private int esta;

    public TipoPers() {
    }

    public TipoPers(int codiTipo, String nombTipo, String fechAlta, String fechBaja, int esta) {
        this.codiTipo = codiTipo;
        this.nombTipo = nombTipo;
        this.fechAlta = fechAlta;
        this.fechBaja = fechBaja;
        this.esta = esta;
    }

    public TipoPers(int codiTipo, String nombTipo) {
        this.codiTipo = codiTipo;
        this.nombTipo = nombTipo;
    }
    

    public int getCodiTipo() {
        return codiTipo;
    }

    public void setCodiTipo(int codiTipo) {
        this.codiTipo = codiTipo;
    }

    public String getNombTipo() {
        return nombTipo;
    }

    public void setNombTipo(String nombTipo) {
        this.nombTipo = nombTipo;
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

    public int getEsta() {
        return esta;
    }

    public void setEsta(int esta) {
        this.esta = esta;
    }
    
}
