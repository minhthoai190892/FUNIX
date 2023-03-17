package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return  runner->{
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryStudent(studentDAO);
//			queryStudentByFirstName(studentDAO);
			queryStudentByEmail(studentDAO);
		};
	}

	private void queryStudentByEmail(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByEmail("ya");
		for (Student student : students
				) {
			System.out.println(student);
		}
	}

	private void queryStudentByFirstName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByFirstName("thanh");
		for (Student student:students
			 ) {
			System.out.println(student);
		}
	}

	private void queryStudent(StudentDAO studentDAO) {
		//get list of student
		List<Student> students = studentDAO.findAll();
		//display list stdent
		for (Student tempStudent : students
				) {
			System.out.println(tempStudent);

		}
	}

	private void readStudent(StudentDAO studentDAO) {
//		create student
		System.out.println("create student");
		Student student = new Student("Thoai","Nguyen","thoainguyen@gmail.com");

		//save the student
		System.out.println("save the student");
		studentDAO.save(student);
		//display id of the student
		int id= 20;
		System.out.println("saved student. Genarated id:"+id);
		//retrieve student based on the id: primary key
		System.out.println("retrieve student based on the id: "+id);
		Student myStudent = studentDAO.findById(id);
		if (myStudent==null){
			System.out.println("Not found");

		}
		//display student
		System.out.println("Found the Student: "+myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple student
		Student student2 = new Student("Thanh 1","Nguyen","thoainguyen@gmail.com");
		Student student3 = new Student("Dan","Nguyen","thoainguyen@gmail.com");
		//save student object
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student");
		Student student = new Student("Thanh","An","thoainguyen@yahoo.com");
		//save the student object
		System.out.println("Saving the student");
		studentDAO.save(student);
		//display id of the saved student
		System.out.println("Saved student. Generated id: "+student.getId());
	}

}
