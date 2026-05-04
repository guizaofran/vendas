package com.projeto.vendas.repositorys;

import com.projeto.vendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
}
