package com.fujiiwill.dscommerce.services;

import com.fujiiwill.dscommerce.dto.OrderDTO;
import com.fujiiwill.dscommerce.dto.ProductDTO;
import com.fujiiwill.dscommerce.entities.Order;
import com.fujiiwill.dscommerce.entities.Product;
import com.fujiiwill.dscommerce.repositories.OrderRepository;
import com.fujiiwill.dscommerce.services.exceptions.ResourseNotFoundException;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourseNotFoundException("Recurso não encontrado"));
        return new OrderDTO (order);
    }
}
