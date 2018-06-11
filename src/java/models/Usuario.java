/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 * Clase usuario 
 * @author daniel
 */
public class Usuario {
    private int id;
    private String username, correo, contraseña, confirmacion_contraseña;
    private LocalDate fecha_creacion;
    private LocalDate fecha_actualizacion;

    
    /**
     * Es un constructo vacio
     */
    public Usuario() {}
    
    public Usuario(int id, String username, String correo, String contraseña, String confirmacion_contraseña, LocalDate fecha_creacion, LocalDate fecha_actualizacion) {
        this.id = id;
        this.username = username;
        this.correo = correo;
        this.contraseña = contraseña;
        this.confirmacion_contraseña = confirmacion_contraseña;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmacion_contraseña() {
        return confirmacion_contraseña;
    }

    public void setConfirmacion_contraseña(String confirmacion_contraseña) {
        this.confirmacion_contraseña = confirmacion_contraseña;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalDate getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(LocalDate fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }
    
    

}
