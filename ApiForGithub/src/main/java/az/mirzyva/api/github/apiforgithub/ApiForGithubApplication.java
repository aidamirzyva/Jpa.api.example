package az.mirzyva.api.github.apiforgithub;

import az.mirzyva.api.github.apiforgithub.Entity.Student;
import az.mirzyva.api.github.apiforgithub.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

@SpringBootApplication
public class ApiForGithubApplication {


    public static void main(String[] args) {
        SpringApplication.run(ApiForGithubApplication.class, args);
    }
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
       return args -> {
            Student student = new Student();




       };


    }

}
