package com.jhlim.homepage.controller;

import com.jhlim.homepage.model.Comment;
import com.jhlim.homepage.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @GetMapping
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }
}

