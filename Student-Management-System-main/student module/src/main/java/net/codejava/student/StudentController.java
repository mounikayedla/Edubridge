package net.codejava.student;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired 
	private StudentService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Student> listStudent = service.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listStudent", listStudent);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newStudentForm(Map<String, Object> model) {
		Student student = new Student();
		model.put("student", student);
		return "new_student";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.save(student);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudentForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_student");
		Student student = service.get(id);
		mav.addObject("student", student);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteStudentForm(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";		
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Student> result = service.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		
		return mav;		
	}	
}