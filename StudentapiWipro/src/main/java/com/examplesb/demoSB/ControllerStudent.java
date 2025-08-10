package com.examplesb.demoSB;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudent {
	
	@Autowired
	private StudentService studentservice;

	@RequestMapping("/first")
	public String first() {
		return "this is my first api";
	}
	
	@RequestMapping("/student")
	public Student showallstudent() {
		Student std = new Student(1, "pajya", 100, "sing");
		return std;
		
	}
	
	 @PostMapping("/addstudent")
	    public String insertstudent(@RequestBody Student student) {
	        return studentservice.insertstudent(student);// ✅ Use the injected instance
	    }
	 
	 @GetMapping("/allstudents")
	 public List<Student> getallstudent(){
		 
		return studentservice.getallstudents();
		 
	 }
	 
	 @GetMapping("/getbysudentid/{id}")
	 public Optional<Student> getstudbyid(@PathVariable long id){
		return studentservice.getstudbyid(id);
		 
	 }
	 
	 @GetMapping("/getAllUsersPage")
	    public Page<Student> getAllUserPage(Pageable pageable)
	    {
	    	 return  studentservice.findAllUserPage(pageable);
	    }
	 
	 @PutMapping("/updateStudent/{id}")
	 public ResponseEntity<Student> updateStudentById(
	         @PathVariable long id,
	        @Valid @RequestBody Student updatedStudent) {

	     Student student = studentservice.updateStudent(id, updatedStudent);
	     return ResponseEntity.ok(student);
	 }
}
