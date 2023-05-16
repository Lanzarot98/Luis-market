package com.luis.market.persistence;

import com.luis.market.persistence.crud.ProductoCrudRepository;
import com.luis.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
