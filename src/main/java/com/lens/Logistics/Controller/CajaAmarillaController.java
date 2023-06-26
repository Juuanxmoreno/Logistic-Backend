/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lens.Logistics.Controller;

import com.lens.Logistics.Dto.CajaAmarillaDTO;
import com.lens.Logistics.Entity.CajaAmarilla;
import com.lens.Logistics.Service.CajaAmarillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://stocklabels-web.web.app"})
@RequestMapping("/cajas-amarillas")
public class CajaAmarillaController {

    private final CajaAmarillaService cajaAmarillaService;

    @Autowired
    public CajaAmarillaController(CajaAmarillaService cajaAmarillaService) {
        this.cajaAmarillaService = cajaAmarillaService;
    }

    @PostMapping
    public ResponseEntity<CajaAmarilla> crearCajaAmarilla(@RequestBody CajaAmarillaDTO cajaAmarillaDTO) {
        CajaAmarilla cajaAmarilla = new CajaAmarilla();
        cajaAmarilla.setNombreCajaAmarilla(cajaAmarillaDTO.getNombreCajaAmarilla());
        cajaAmarilla.setAlto(cajaAmarillaDTO.getAlto());
        cajaAmarilla.setAncho(cajaAmarillaDTO.getAncho());
        cajaAmarilla.setProfundidad(cajaAmarillaDTO.getProfundidad());
        cajaAmarilla.setPeso(cajaAmarillaDTO.getPeso());
        cajaAmarilla.setCosto(cajaAmarillaDTO.getCosto());
        cajaAmarilla.setTransporteAereo(cajaAmarillaDTO.isTransporteAereo());
        cajaAmarilla.setCajasBlancas(cajaAmarillaDTO.getCajasBlancas());

        CajaAmarilla cajaAmarillaGuardada = cajaAmarillaService.crearCajaAmarilla(cajaAmarilla);
        return new ResponseEntity<>(cajaAmarillaGuardada, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CajaAmarilla>> obtenerTodasLasCajasAmarillas() {
        List<CajaAmarilla> cajasAmarillas = cajaAmarillaService.obtenerTodasLasCajasAmarillas();
        return new ResponseEntity<>(cajasAmarillas, HttpStatus.OK);
    }
}
