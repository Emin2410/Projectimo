package com.example.Projectim.RepositoryPage;

import com.example.Projectim.StudentFolder.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student , Integer> {

}
