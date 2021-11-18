package co.com.poli.curses.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "instructors")
public class Instructor extends EntityBase {

    @Column(name = "name") // no es necesario agregarlo si el attr se llama igual que la columna de la tabla
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "instructor", cascade = CascadeType.PERSIST)
    private List<Course> courses;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
