/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lens.Logistics.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CajaBlanca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCajaBlanca;
    private double pesoCajaBlanca;
    private double altoCajaBlanca;
    private double anchoCajaBlanca;
    private double profundidadCajaBlanca;
    private String modeloLente;
    private double pesoLente;
    private String colorLente;
    private int cantidadLentes;

    // Constructor vacío
    public CajaBlanca() {
    }

    // Constructor con parámetros
    public CajaBlanca(String nombreCajaBlanca, double pesoCajaBlanca, double altoCajaBlanca, double anchoCajaBlanca,
            double profundidadCajaBlanca, String modeloLente, double pesoLente, String colorLente,
            int cantidadLentes) {
        this.nombreCajaBlanca = nombreCajaBlanca;
        this.pesoCajaBlanca = pesoCajaBlanca;
        this.altoCajaBlanca = altoCajaBlanca;
        this.anchoCajaBlanca = anchoCajaBlanca;
        this.profundidadCajaBlanca = profundidadCajaBlanca;
        this.modeloLente = modeloLente;
        this.pesoLente = pesoLente;
        this.colorLente = colorLente;
        this.cantidadLentes = cantidadLentes;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCajaBlanca() {
        return nombreCajaBlanca;
    }

    public void setNombreCajaBlanca(String nombreCajaBlanca) {
        this.nombreCajaBlanca = nombreCajaBlanca;
    }

    public double getPesoCajaBlanca() {
        return pesoCajaBlanca;
    }

    public void setPesoCajaBlanca(double pesoCajaBlanca) {
        this.pesoCajaBlanca = pesoCajaBlanca;
    }

    public double getAltoCajaBlanca() {
        return altoCajaBlanca;
    }

    public void setAltoCajaBlanca(double altoCajaBlanca) {
        this.altoCajaBlanca = altoCajaBlanca;
    }

    public double getAnchoCajaBlanca() {
        return anchoCajaBlanca;
    }

    public void setAnchoCajaBlanca(double anchoCajaBlanca) {
        this.anchoCajaBlanca = anchoCajaBlanca;
    }

    public double getProfundidadCajaBlanca() {
        return profundidadCajaBlanca;
    }

    public void setProfundidadCajaBlanca(double profundidadCajaBlanca) {
        this.profundidadCajaBlanca = profundidadCajaBlanca;
    }

    public String getModeloLente() {
        return modeloLente;
    }

    public void setModeloLente(String modeloLente) {
        this.modeloLente = modeloLente;
    }

    public double getPesoLente() {
        return pesoLente;
    }

    public void setPesoLente(double pesoLente) {
        this.pesoLente = pesoLente;
    }

    public String getColorLente() {
        return colorLente;
    }

    public void setColorLente(String colorLente) {
        this.colorLente = colorLente;
    }

    public int getCantidadLentes() {
        return cantidadLentes;
    }

    public void setCantidadLentes(int cantidadLentes) {
        this.cantidadLentes = cantidadLentes;
    }
}
