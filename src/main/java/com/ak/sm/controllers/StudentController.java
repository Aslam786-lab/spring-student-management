package com.ak.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ak.sm.DAO.StudentDao;
import com.ak.sm.api.Student;
import com.ak.sm.service.StudentService;


@Controller
public class StudentController {

	
	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		//call the service method to get data 
		List<Student> studentsList = studentService.loadStudents();
		
		model.addAttribute("students", studentsList);
		
		
		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		
		model.addAttribute("student", new Student());
		
		return "add-student";
	}
	
	
	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		
		//write the logic to save the data in database
		//Do a service call to save the students
		System.out.println(student);
		if(student.getId()==0) {
		//insert new record
			studentService.saveStudent(student);	
		}
		else {
			studentService.update(student);
		}
		
		return "redirect:/showStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id ,Model model) {
		
		Student theStudent=studentService.getStudent(id);
		
		model.addAttribute("student", theStudent);
		
		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		studentService.deleteStudent(id);
		
		return "redirect:/showStudent";
	}
	
	
	
}
