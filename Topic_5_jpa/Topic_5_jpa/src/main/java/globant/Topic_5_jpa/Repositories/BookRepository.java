package globant.Topic_5_jpa.Repositories;

import globant.Topic_5_jpa.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
