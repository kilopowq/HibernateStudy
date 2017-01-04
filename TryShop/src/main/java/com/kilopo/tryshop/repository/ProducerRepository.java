package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
}