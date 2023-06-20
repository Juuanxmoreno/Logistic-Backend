/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lens.Logistics.Service;

import com.lens.Logistics.Entity.Boxes;
import com.lens.Logistics.Repository.BoxesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxesService {

    private final BoxesRepository boxesRepository;

    @Autowired
    public BoxesService(BoxesRepository boxesRepository) {
        this.boxesRepository = boxesRepository;
    }

    public Boxes save(Boxes boxes) {
        return boxesRepository.save(boxes);
    }

    public Optional<Boxes> findById(int id) {
        return boxesRepository.findById(id);
    }

    public List<Boxes> findAll() {
        return boxesRepository.findAll();
    }

    public void deleteById(int id) {
        boxesRepository.deleteById(id);
    }
}
