package com.projeto.vendas.repositorys;

import com.projeto.vendas.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
