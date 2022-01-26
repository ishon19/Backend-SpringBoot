package com.shreyans.springbootapi;

import com.shreyans.springbootapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Shreyans", "test@mail.com", LocalDate.of(1993, 12, 3), 21 ));
	}

}
