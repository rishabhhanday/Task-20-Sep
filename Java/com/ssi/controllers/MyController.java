package com.ssi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.StudentEntity;
import com.ssi.services.StudentService;

@Controller
public class MyController {
		@Autowired
		StudentService service;
	
		@RequestMapping("add")
		public ModelAndView insertRecord(@ModelAttribute("student")StudentEntity student){
			service.studentEntry(student);
			ModelAndView mv=new ModelAndView("ViewRecord");
			return mv;
		}
		
		@RequestMapping("viewall")
		public ModelAndView viewRecord(){
			List<StudentEntity> list=service.viewAllStudents();
			ModelAndView mv=new ModelAndView("ViewRecord");
			mv.addObject(list);
			return mv;
		}
		
		@RequestMapping("updatestudent")
		public ModelAndView updateStudent(@ModelAttribute("student") StudentEntity student){
			service.changeStudentDetails(student);
			ModelAndView mv=new ModelAndView("redirect:viewall");
			return mv;
		}
		
		@RequestMapping("removestudent")
		public ModelAndView removeStudent(@RequestParam("sid") int code){
			service.deleteStudent(code);
			ModelAndView mv=new ModelAndView("redirect:viewall");
			return mv;
		}
		
		@RequestMapping("Update")
		public ModelAndView update(@RequestParam("sid") int code){
			StudentEntity student=service.getStudent(code);
			ModelAndView mv=new ModelAndView("UpdateStudent");
			mv.addObject(student);
			return mv;
		}
		
		
		
}
