/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * clase categoriaArticulo      
 * @author daniel
 */
public class CategoriaArticulo {
    
    private int id;
    private LocalDate fecha_creacion, fecha_actualizacion; 
    private List<Categoria> categoria;
    private List<Articulo> articulo;

    public CategoriaArticulo() {
        categoria = new ArrayList<>();
        articulo = new ArrayList<>();
    }

    public CategoriaArticulo(int id, LocalDate fecha_creacion, LocalDate fecha_actualizacion, List<Categoria> categoria, List<Articulo> articulo) {
        this.id = id;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.categoria = categoria;
        this.articulo = articulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }

    
    
}
