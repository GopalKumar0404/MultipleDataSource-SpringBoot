package com.gopal.multipleDatasource.mySql.repo;

import com.gopal.multipleDatasource.mySql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
