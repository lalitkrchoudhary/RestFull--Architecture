package in.lalit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lalit.dao.IStudentDao;
import in.lalit.exception.StudentRecordNotFoundException;
import in.lalit.model.Student;

@Service("service")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;
	
	@Override
	public String saveStudent(Student student) {
		 Student temp= dao.save(student);
		return "Student save with id :: "+temp.getSid();
	}

	@Override
	public List<Student> findAll() {

		List<Student> students= dao.findAll();
		return students;
	}

	@Override
	public Student findById(Integer id) {
		
		return dao.findById(id).orElseThrow(()-> new StudentRecordNotFoundException("Student Record not found"));
	}

}
