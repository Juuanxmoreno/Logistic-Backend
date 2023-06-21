/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lens.Logistics.Service;

import com.lens.Logistics.Entity.CajaAmarilla;
import com.lens.Logistics.Repository.CajaAmarillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CajaAmarillaService {

    private final CajaAmarillaRepository cajaAmarillaRepository;

    @Autowired
    public CajaAmarillaService(CajaAmarillaRepository cajaAmarillaRepository) {
        this.cajaAmarillaRepository = cajaAmarillaRepository;
    }

    public CajaAmarilla crearCajaAmarilla(CajaAmarilla cajaAmarilla) {
        return cajaAmarillaRepository.save(cajaAmarilla);
    }

    public List<CajaAmarilla> obtenerTodasLasCajasAmarillas() {
        return cajaAmarillaRepository.findAll();
    }
}
