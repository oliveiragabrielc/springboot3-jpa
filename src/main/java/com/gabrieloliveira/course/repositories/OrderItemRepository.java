package com.gabrieloliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieloliveira.course.entities.OrderItem;
import com.gabrieloliveira.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
