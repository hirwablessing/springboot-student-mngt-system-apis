package rw.ac.rca.classcApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.classcApp.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
