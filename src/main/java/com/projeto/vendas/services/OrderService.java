package com.projeto.vendas.services;

import com.projeto.vendas.entities.Order;
import com.projeto.vendas.entities.User;
import com.projeto.vendas.repositorys.OrderRepository;
import com.projeto.vendas.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
