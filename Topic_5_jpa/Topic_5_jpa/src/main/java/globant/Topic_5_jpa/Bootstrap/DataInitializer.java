package globant.Topic_5_jpa.Bootstrap;

import globant.Topic_5_jpa.Model.Book;
import globant.Topic_5_jpa.Repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

        private final BookRepository bookRepository;

        public DataInitializer(BookRepository bookRepository) {
                this.bookRepository = bookRepository;
        }

        @Override
        public void run(String... args) throws Exception {

                Book book1 = new Book("Moby Dick","123","Richard Bentley");
                Book save1 = bookRepository.save(book1);
                System.out.println("Id: "+save1.getId());

                Book book2 = new Book("Frankenstein","456","Lackington");
                Book save2 = bookRepository.save(book2);
                System.out.println("Id: "+save2.getId());

                bookRepository.findAll().forEach(book ->{
                        System.out.println("Book id: "+book.getId());
                        System.out.println("Book title: "+ book.getTitle());
                         });


        }
}
