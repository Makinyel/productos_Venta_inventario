package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto,String> {

}
