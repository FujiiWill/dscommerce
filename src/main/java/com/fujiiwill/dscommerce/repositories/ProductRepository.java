package com.fujiiwill.dscommerce.repositories;

import com.fujiiwill.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
