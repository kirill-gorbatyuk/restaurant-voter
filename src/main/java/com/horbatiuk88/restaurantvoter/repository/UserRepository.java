package com.horbatiuk88.restaurantvoter.repository;

import com.horbatiuk88.restaurantvoter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findOneByName(String name);
}
