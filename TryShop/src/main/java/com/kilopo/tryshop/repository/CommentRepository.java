package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Order, Long> {
}
