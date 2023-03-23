package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.ProductoDto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ProductoRepository extends JpaRepository<ProductoDto,String> {

    @Query(nativeQuery = true, value = "update producto_dto set nombre = :nombre, precio = :precio, " +
            "cantidad = :cantidad where id_producto = :idProducto")
    @Modifying
    public void editCar(@Param("idProducto") String idProducto,
                        @Param("nombre") String nombre,
                        @Param("precio") Double precio,
                        @Param("cantidad") int cantidad);
}
