package com.topic_5_jpa.Service;

import com.topic_5_jpa.Model.Students;
import com.topic_5_jpa.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Students> findAll() {

        return studentsRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Students> findAll(Pageable pageable) {
        return studentsRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Students> findById(Long id) {
        return studentsRepository.findById(id);
    }

    @Override
    @Transactional
    public Students save(Students student) {
        return studentsRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        studentsRepository.deleteById(id);

    }
}
