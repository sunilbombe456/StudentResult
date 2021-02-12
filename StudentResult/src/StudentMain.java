import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class StudentMain {

	private static StudentService studentService = new StudentServiceImpl();
	
	private static List<Student> studentList = new ArrayList<Student>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(n<5) {
			System.out.println("1: Add New Student");
			System.out.println("2: Print All Students");
			System.out.println("3: Sorting by Adress");
			System.out.println("4: Sorting by Result");
			System.out.println("5: Exit");
			System.out.println("Enter the Option from Menu..!");
			n = sc.nextInt();
			switch(n) {
			case 1:System.out.println("How Many New Student You want To Add");
					int number = sc.nextInt();
					studentList = studentService.addStudent(studentList,sc,number); 
				break;
			case 2: studentService.printAllStudentList(studentList);
				break;
			case 3: studentService.filterByAddress(studentList);
				break;
			case 4: studentService.filterByResult(studentList);
			default:
				break;
			}
			
		}
		
		
		

	}

}
