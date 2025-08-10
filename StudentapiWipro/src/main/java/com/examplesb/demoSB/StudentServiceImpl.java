package com.examplesb.demoSB;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentrepo;
	
	public String insertstudent(Student std) {
		studentrepo.save(std);
		return "datainserted";
	}

	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	public Optional<Student> getstudbyid(long id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id);
	}

	public Page<Student> findAllUserPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return studentrepo.findAll(pageable);
	}

	
	public Student updateStudent(long id, Student updatedStudent) {
		// TODO Auto-generated method stub
		 Student existingStudent = studentrepo.findById(id)
		            .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

		    existingStudent.setName(updatedStudent.getName());
		    existingStudent.setMarks(updatedStudent.getMarks());
		    existingStudent.setHobbies(updatedStudent.getHobbies());

		    return studentrepo.save(existingStudent);
	}

}
