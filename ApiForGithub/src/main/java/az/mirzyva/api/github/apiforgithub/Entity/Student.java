package az.mirzyva.api.github.apiforgithub.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity
@Data
@Table(name = "Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name ="name",nullable = false)
    public String name;
    @Column(name ="surname",nullable = false)
    public String surname;
    @Column(name ="email",nullable = false)
    public String email;
    @Column(name ="studentNumber",nullable = false)
    public String studentNumber;

}
