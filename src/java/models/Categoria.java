/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 * Clase categoria que funciona para listar articulos por categorias
 * @author daniel
 */
public class Categoria {
    private int id;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;
    
    /**
     * Clase constructora
     * @param id el id de la categoria
     * @param nombre el nombre de la categoria 
     * @param fechaCreacion la fecha de creacion de la categoria
     * @param fechaActualizacion la fecha de actualización de la categoria
     */
     public Categoria(int id, String nombre, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Categoria() {}

    

    /**
     * Getter y setter de cada uno de los atributos
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

   
    
}
