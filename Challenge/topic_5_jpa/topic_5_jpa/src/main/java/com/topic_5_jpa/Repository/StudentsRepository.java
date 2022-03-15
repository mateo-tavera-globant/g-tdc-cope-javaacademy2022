package com.topic_5_jpa.Repository;

import com.topic_5_jpa.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Implementing all CRUD methods
@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {


}
