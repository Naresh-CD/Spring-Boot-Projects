package com.curiousgeek.curiousgeekblog.repository;

import com.curiousgeek.curiousgeekblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
