package service;

import java.util.List;
import java.util.Scanner;

import entity.Student;

public interface StudentService {

	List<Student> addStudent(List<Student> studentList, Scanner sc, int number);

	void printAllStudentList(List<Student> studentList);

	void filterByAddress(List<Student> studentList);

	void filterByResult(List<Student> studentList);

	void saveIntoFile(List<Student> studentList);


	


}
