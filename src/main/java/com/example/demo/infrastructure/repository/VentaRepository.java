package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.VentaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<VentaDto,String> {
}
