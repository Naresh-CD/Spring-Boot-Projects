package com.curiousgeek.curiousgeekblog.service;

import com.curiousgeek.curiousgeekblog.web.dto.PostDto;

import java.util.List;

public interface PostService  {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();
}


