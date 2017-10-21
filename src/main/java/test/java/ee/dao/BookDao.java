package test.java.ee.dao;

import test.java.ee.entity.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookDao {

    @PersistenceContext
    private EntityManager em;

    public void insertBook(Book book){
        em.persist(book);
    }

    public Book getBookById(Long id){
        return em.find(Book.class, id);
    }

}
