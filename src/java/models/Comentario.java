/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 * clase comentario
 * @author daniel
 */
public class Comentario {
    
    private int id;
    private String contenido; 
    private LocalDate fecha_creacion, fecha_actualizacion;
    private Usuario usuario;
    private Articulo articulo;

    
    public Comentario() {
    }

    public Comentario(int id, String contenido, LocalDate fecha_creacion, LocalDate fecha_actualizacion, Usuario usuario, Articulo articulo) {
        this.id = id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.usuario = usuario;
        this.articulo = articulo;
    }
    
    
    
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
