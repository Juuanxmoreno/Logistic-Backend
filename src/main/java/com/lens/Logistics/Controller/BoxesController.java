package com.lens.Logistics.Controller;

import com.lens.Logistics.Entity.Boxes;
import com.lens.Logistics.Service.BoxesService;
import com.lens.Logistics.Dto.BoxesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boxes")
public class BoxesController {

    private final BoxesService boxesService;

    @Autowired
    public BoxesController(BoxesService boxesService) {
        this.boxesService = boxesService;
    }

    @PostMapping
    public ResponseEntity<Boxes> createBox(@RequestBody BoxesDTO boxesDTO) {
        Boxes newBox = convertToEntity(boxesDTO);
        Boxes createdBox = boxesService.save(newBox);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBox);
    }

    @GetMapping
    public ResponseEntity<List<Boxes>> getAllBoxes() {
        List<Boxes> boxesList = boxesService.findAll();
        return ResponseEntity.ok(boxesList);
    }

    private Boxes convertToEntity(BoxesDTO boxesDTO) {
        Boxes boxes = new Boxes();
        boxes.setNombreCajaAmarilla(boxesDTO.getNombreCajaAmarilla());
        boxes.setAlto(boxesDTO.getAlto());
        boxes.setAncho(boxesDTO.getAncho());
        boxes.setProfundidad(boxesDTO.getProfundidad());
        boxes.setPeso(boxesDTO.getPeso());
        boxes.setCosto(boxesDTO.getCosto());
        boxes.setTransporteAereo(boxesDTO.isTransporteAereo());
        return boxes;
    }
}
