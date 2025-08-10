package com.examplesb.demoSB;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
	public String insertstudent(Student std) ;
	public List<Student> getallstudents();
	public Optional<Student> getstudbyid(long id);
	public Page<Student> findAllUserPage(Pageable pageable);
	public Student updateStudent(long id, Student updatedStudent);
}
