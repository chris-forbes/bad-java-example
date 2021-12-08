package digital.and.bad.badexample.configuration;

import digital.and.bad.badexample.model.Book;
import digital.and.bad.badexample.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookRepoInitializer {
    @Bean
    CommandLineRunner initDatabase(BookRepo bookRepo) {
        return args -> {
            bookRepo.save(new Book(1, "test", 2.00d));
            bookRepo.save(new Book(2, "test2", 3.00d));
            bookRepo.save(new Book(3, "test3", 4.00d));
        };
    }
}
