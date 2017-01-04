package com.kilopo.tryshop.repository;


import com.kilopo.tryshop.entity.Product;
import com.kilopo.tryshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
