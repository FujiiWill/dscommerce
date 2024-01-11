package com.fujiiwill.dscommerce.repositories;

import com.fujiiwill.dscommerce.entities.Order;
import com.fujiiwill.dscommerce.entities.OrderItem;
import com.fujiiwill.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
