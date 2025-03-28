package com.swapshelf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface regRepo extends JpaRepository<login, String> {
    login findByUsername(String username);

}
