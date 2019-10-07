package com.ansikt.springit.repository;

import com.ansikt.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
}
