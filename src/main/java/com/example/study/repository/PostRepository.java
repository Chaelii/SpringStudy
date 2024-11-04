package com.example.study.repository;

import com.example.study.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // 제목 또는 본문 내용으로 검색하는 메서드
    List<Post> findByTitleContainingOrContentContaining(String title, String content);
}
