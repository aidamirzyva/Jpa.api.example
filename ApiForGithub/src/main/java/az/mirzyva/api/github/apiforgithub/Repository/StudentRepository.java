package az.mirzyva.api.github.apiforgithub.Repository;

import az.mirzyva.api.github.apiforgithub.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {



}
