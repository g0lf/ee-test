package test.java.ee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.java.ee.services.BookService;

import javax.ejb.EJB;

@RestController
@RequestMapping("/")
public class TestController {

    @EJB(mappedName = "java:module/BookService")
    private BookService bookService;

    @GetMapping
    public void index(){
        bookService.createBook();
    }

}
