package com.example.study.exception;

public class PostException extends RuntimeException {
    public PostException(Long id) {
        super("해당 게시물(id=" + id + ")이(가) 없습니다.");
    }
}
