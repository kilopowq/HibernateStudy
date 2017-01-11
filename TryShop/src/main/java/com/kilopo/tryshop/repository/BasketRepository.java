package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long>{
}
