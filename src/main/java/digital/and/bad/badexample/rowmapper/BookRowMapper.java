package digital.and.bad.badexample.rowmapper;

import digital.and.bad.badexample.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("id"));
        book.setCost(rs.getDouble("cost"));
        book.setName(rs.getString("name"));
        return book;
    }
}
