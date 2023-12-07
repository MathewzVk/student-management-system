package com.mathewzvk.sms;

import com.mathewzvk.sms.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication {


	@Autowired
	StudentRepository theStudentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner commandLineRunner(String[] args) {
//		return this::run;
//	}
//
//
//	private void run(String... runner) {
//		Student stud1 = new Student("Mathews", "CSE", "Mananthavady");
//
//		theStudentRepository.save(stud1);
//
//	}
}
