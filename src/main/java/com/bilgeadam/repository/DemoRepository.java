package com.bilgeadam.repository;

import com.bilgeadam.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository  extends JpaRepository<Demo,Long> {
}
