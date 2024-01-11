package com.fujiiwill.dscommerce.repositories;

import com.fujiiwill.dscommerce.entities.Order;
import com.fujiiwill.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
