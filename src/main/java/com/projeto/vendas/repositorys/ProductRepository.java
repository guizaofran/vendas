package com.projeto.vendas.repositorys;

import com.projeto.vendas.entities.Category;
import com.projeto.vendas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
