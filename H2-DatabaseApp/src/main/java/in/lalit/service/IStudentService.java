package in.lalit.service;

import java.util.List;

import in.lalit.model.Student;

public interface IStudentService {

	public String saveStudent(Student student);
	public List<Student> findAll();
	public Student findById(Integer id);
}
