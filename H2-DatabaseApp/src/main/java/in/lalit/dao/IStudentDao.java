package in.lalit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.model.Student;

public interface IStudentDao extends JpaRepository<Student, Integer> {

}
