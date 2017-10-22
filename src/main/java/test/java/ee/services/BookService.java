package test.java.ee.services;

import test.java.ee.dao.BookDao;
import test.java.ee.entity.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BookService {

    private BookDao bookDao;

    @SuppressWarnings("unused")
    public BookService(){

    }

    @Inject
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book createBook(){
        Book book = new Book();
        book.setAuthor("asasd");
        book.setName("sdsdf");
        bookDao.insertBook(book);
        System.out.println("Service executed");
        return book;
    }

}
