package com.projeto.vendas.repositorys;

import com.projeto.vendas.entities.OrderItem;
import com.projeto.vendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem,Long> {
}
