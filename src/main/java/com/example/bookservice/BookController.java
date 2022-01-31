package com.example.bookservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable long bookId){
        return bookService.findById(bookId).orElse(new Book());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable long bookId) {
        bookService.deleteById(bookId);
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
        return bookService.save(book);
    }

//    @PatchMapping("{/bookId}")
//    public Book updateBook(@RequestBody Map<String,String> updates, @PathVariable Long bookId){
//        return bookService.updateBook(updates, bookId);
//    }





}
