package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<UserStatus, Long> {
}
