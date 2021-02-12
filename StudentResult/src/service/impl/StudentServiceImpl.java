package service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import entity.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> addStudent(List<Student> studentList, Scanner sc, int number) {
		// TODO Auto-generated method stub
		for(int i=0; i<number; i++) {
			Student student = new Student();
			System.out.println("Enter Roll No");
			student.setId(sc.nextInt());
			System.out.println("Enter Name of Student");
			student.setName(sc.next());
			System.out.println("Enter the Address");
			student.setAddress(sc.next());
			System.out.println("Enter the Result percentage");
			student.setResult(sc.nextFloat());
			studentList.add(student);
		}
		return studentList;
	}

	@Override
	public void printAllStudentList(List<Student> studentList) {
		// TODO Auto-generated method stub
		Iterator i = studentList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

	@Override
	public void filterByAddress(List<Student> studentList) {
		List<Student> list = new ArrayList<Student>();
		list.addAll(studentList);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address for Filter");
		String addr = sc.next();
		ListIterator i = list.listIterator();
		while(i.hasNext()) {
			Student student = (Student) i.next();
			if(!addr.equals(student.getAddress())) {
				i.remove();
			}
		}	
		printAllStudentList(list);
	}

	@Override
	public void filterByResult(List<Student> studentList) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage for Filter");
		float percentage = sc.nextFloat();
		List<Student> list = new ArrayList<Student>();
		list.addAll(studentList);
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			Student student = (Student) li.next(); 
			if(student.getResult()<percentage) {
				li.remove();
			}
		}
		printAllStudentList(list);
	}

	

}
