/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lens.Logistics.Entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CajaAmarilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCajaAmarilla;
    private double alto;
    private double ancho;
    private double profundidad;
    private double peso;
    private double costo;
    private boolean transporteAereo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CajaBlanca> cajasBlancas;

    // Constructor vacío
    public CajaAmarilla() {
    }

    // Constructor con parámetros
    public CajaAmarilla(String nombreCajaAmarilla, double alto, double ancho, double profundidad, double peso,
            double costo, boolean transporteAereo, List<CajaBlanca> cajasBlancas) {
        this.nombreCajaAmarilla = nombreCajaAmarilla;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.peso = peso;
        this.costo = costo;
        this.transporteAereo = transporteAereo;
        this.cajasBlancas = cajasBlancas;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCajaAmarilla() {
        return nombreCajaAmarilla;
    }

    public void setNombreCajaAmarilla(String nombreCajaAmarilla) {
        this.nombreCajaAmarilla = nombreCajaAmarilla;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isTransporteAereo() {
        return transporteAereo;
    }

    public void setTransporteAereo(boolean transporteAereo) {
        this.transporteAereo = transporteAereo;
    }

    public List<CajaBlanca> getCajasBlancas() {
        return cajasBlancas;
    }

    public void setCajasBlancas(List<CajaBlanca> cajasBlancas) {
        this.cajasBlancas = cajasBlancas;
    }
}
