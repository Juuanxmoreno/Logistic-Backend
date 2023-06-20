/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lens.Logistics.Repository;

import com.lens.Logistics.Entity.Boxes;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxesRepository extends JpaRepository<Boxes, Integer> {

    @Override
    Boxes save(Boxes boxes);

    @Override
    Optional<Boxes> findById(Integer id);

    @Override
    List<Boxes> findAll();

    @Override
    void deleteById(Integer id);
}
