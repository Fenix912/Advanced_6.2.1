package com.example.clientservice.controller;

import com.example.clientservice.clients.BookServiceClient;
import com.example.clientservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/client")
public class ClientRestController {
    private final BookServiceClient bookServiceClient;

    @GetMapping("/books")
    List<Book> getAllBooksFromClient() {
        return bookServiceClient.getAllBooks();
    }
}