package com.VishalBari4ScriptSage.store.repositories;

import com.VishalBari4ScriptSage.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}