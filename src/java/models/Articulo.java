/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase articulo
 * @author daniel
 */
public class Articulo {
    private int id;
    private String titulo, contenido, descripcion;
    private LocalDate fecha_creacion, fecha_actualizacion;
    private Usuario usuario;
    private ArrayList<Categoria> categorias ;
   
    public Articulo(int id, String titulo, String contenido, String descripcion, LocalDate fecha_creacion, LocalDate fecha_actualizacion, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.usuario = usuario;
    }

    public Articulo() {
    }
    
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
