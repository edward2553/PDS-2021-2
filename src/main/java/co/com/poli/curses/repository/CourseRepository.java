package co.com.poli.curses.repository;

import co.com.poli.curses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import org.springframework.data.repository.CrudRepository; aqui ya estan los métodos
// import org.springframework.data.repository.Repository; esta es la base

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
