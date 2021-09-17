package com.curiousgeek.curiousgeekblog.repository;

import com.curiousgeek.curiousgeekblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
