package com.curiousgeek.curiousgeekblog.service.impl;

import com.curiousgeek.curiousgeekblog.model.Post;
import com.curiousgeek.curiousgeekblog.repository.PostRepository;
import com.curiousgeek.curiousgeekblog.service.PostService;
import com.curiousgeek.curiousgeekblog.web.dto.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        // convert DTO to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());

        Post newPost = postRepository.save(post);

        // convert entity to DTO
        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setContent(newPost.getContent());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setTitle(newPost.getTitle());

        return postResponse;
    }
}
