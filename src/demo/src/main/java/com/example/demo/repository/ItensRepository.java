package com.example.demo.repository;

import com.example.demo.model.ItensPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<ItensPedidoModel, Integer> {
}
