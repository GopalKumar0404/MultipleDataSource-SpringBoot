package com.gopal.multipleDatasource.postgres.repo;

import com.gopal.multipleDatasource.postgres.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
