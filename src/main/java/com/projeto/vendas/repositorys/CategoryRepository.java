package com.projeto.vendas.repositorys;

import com.projeto.vendas.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
