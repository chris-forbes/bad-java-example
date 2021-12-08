package digital.and.bad.badexample.services;

import digital.and.bad.badexample.dao.BookDao;
import digital.and.bad.badexample.model.Book;
import digital.and.bad.badexample.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepository;

    @Autowired
    BookDao bookDao;

    public BookService(){
        //Noop
    }

    public Book findBookById(Integer id) {
        return bookDao.findBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
