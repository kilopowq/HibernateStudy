package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Orderrepository extends JpaRepository<Order, Long> {
}
