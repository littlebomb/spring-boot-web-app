package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService{
    public List<Post> posts = new ArrayList<>();
    public PostService(){
        posts.add(new Post("ass"));
        posts.add(new Post("n"));
        posts.add(new Post("titties"));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
