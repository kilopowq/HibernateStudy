package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
