package digital.and.bad.badexample.dao;

import digital.and.bad.badexample.model.Book;
import digital.and.bad.badexample.rowmapper.BookRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookDao {

    public BookDao(){
        //noop
    }


    @Autowired
    JdbcTemplate jdbcTemplate;

    public Book findBookById(int id) {
        String sql = "select * from book where id = " + Integer.toString(id) + ";";
        Book o = (Book) jdbcTemplate.query(sql, new BookRowMapper()).get(0);

        return o;
    }

}
