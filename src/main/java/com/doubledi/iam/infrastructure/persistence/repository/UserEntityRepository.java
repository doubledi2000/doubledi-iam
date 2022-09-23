package com.doubledi.iam.infrastructure.persistence.repository;

import com.doubledi.iam.infrastructure.persistence.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, String> {
    @Query(name = "select u from UserEntity u where u.deleted = false and u.username = :username")
    Optional<UserEntity> findUserByUsername(String username);
}
