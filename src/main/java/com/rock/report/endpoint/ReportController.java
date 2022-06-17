package com.rock.report.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rock.report.service.ReportService;
import com.rock.report.entity.User;

@RestController
@RequestMapping(path="/report")
public class ReportController {
	@Autowired
	private ReportService reportService;

	@PostMapping(path="/addUser")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		reportService.saveUser(user);
		
		return "The user " + name + " has been saved.";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		System.out.println("getAllUsers");
		return reportService.findAll();
	}
}
