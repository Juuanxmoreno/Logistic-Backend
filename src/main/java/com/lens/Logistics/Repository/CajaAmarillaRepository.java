/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lens.Logistics.Repository;

import com.lens.Logistics.Entity.CajaAmarilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajaAmarillaRepository extends JpaRepository<CajaAmarilla, Long> {
}
