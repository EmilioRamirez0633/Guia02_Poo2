/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Persona;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PersonaCtrl {
    
    public List<Persona> consTodo()
    {
       List<Persona> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("SELECT pers.CODI_PERS, pers.NOMB_PERS, pers.APEL_PERS, pers.FOTO_PERS, pers.CODI_TIPO_PERS, pers.GENE_PERS, pers.FECH_NACI_PERS, DUI_PERS, NIT_PERS, TIPO_SANG_PERS, pers.CODI_UBIC_GEOG, pers.FECH_ALTA, pers.FECH_BAJA, pers.ESTA FROM pers,tipo_pers,ubic_geog WHERE tipo_pers.CODI_TIPO_PERS = pers.CODI_TIPO_PERS and ubic_geog.CODI_UBIC_GEOG = pers.CODI_UBIC_GEOG");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Persona(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBytes(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getInt(14)));
            }
            //Se carga el 
        }
        catch(Exception err)
        {
            err.printStackTrace();
        }
        finally
        {
            try
            {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            }
            catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
        return resp;
    } 
    
    
    public boolean guar(Persona obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("INSERT INTO pers VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            cmd.setString(1, obje.getNombPers());
            cmd.setString(2, obje.getApelPers());
            cmd.setBytes(3, obje.getFotoPers());
            cmd.setInt(4, obje.getCodiTipoPers());
            cmd.setString(5, obje.getGenerPers());
            cmd.setString(6, obje.getFechNaci());
            cmd.setString(7, obje.getDui());
            cmd.setString(8, obje.getNit());
            cmd.setString(9, obje.getTipoSang());
            cmd.setInt(10, obje.getCodiUbi());
            cmd.setString(11, obje.getFechAlta());
            cmd.setString(12, obje.getFechBaja());
            cmd.setInt(13, obje.getEsta());
            cmd.executeUpdate();
            resp=true;
        }
        catch(Exception ex)
        {
            System.err.println("Error al guardar Persona: " + ex.getMessage());
        }
        finally
        {
            try
            {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            }
            catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
        return resp;
    }
}
