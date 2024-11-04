package com.example.study.service;

import com.example.study.exception.PostException;
import com.example.study.model.Post;
import com.example.study.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(String title, String content) {
        Post post = Post.builder()
                .title(title)
                .content(content)
                .build();
        return postRepository.save(post);
    }

    public List<Post> searchPosts(String keyword) {
        List<Post> posts = postRepository.findByTitleContainingOrContentContaining(keyword, keyword);
        if (posts.isEmpty()) {
            throw new PostException("조회된 게시물이 없습니다.");
        }
        return posts;
    }

    public Optional<Post> getPost(Long id) {
        return postRepository.findById(id)
                .or(() -> {
                    throw new PostException("해당 게시물이 없습니다.");
                });
    }

    public Post updatePost(Long id, String title, String content) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new PostException("해당 게시물이 없습니다."));
        post.setTitle(title);
        post.setContent(content);
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        if (!postRepository.existsById(id)) {
            throw new PostException("해당 게시물이 없습니다.");
        }
        postRepository.deleteById(id);
    }
}
