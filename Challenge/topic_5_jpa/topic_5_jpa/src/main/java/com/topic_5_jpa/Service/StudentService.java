package com.topic_5_jpa.Service;

import com.topic_5_jpa.Model.Students;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public interface StudentService {

    public Iterable<Students> findAll();
    public Page<Students> findAll(Pageable pageable);
    public Optional<Students> findById(Long id);
    public Students save(Students student);
    public void deleteById(Long id);
}
