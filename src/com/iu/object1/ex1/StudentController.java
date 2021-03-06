package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	//객체 생성
	Scanner sc;
	StudentService studentservice;
	StudentView studentview;
	Student [] students;
	
	public StudentController() {//객체의 멤버변수(sc, studentservice, students)를 사용해서 기본생성자를 만들어 다른 메서드에서도 사용하는 것
		sc = new Scanner(System.in);
		studentview = new StudentView();
		studentservice = new StudentService();
	}
	
	//start메서드를 선언
//	System.out.println("1. 학생 정보 입력");
//	System.out.println("2. 학생 정보 조회");
//	System.out.println("3. 학생 정보 검색");
//	System.out.println("4. 학생 정보 삭제");
//	System.out.println("5. 학생 정보 추가");
//	System.out.println("6. 학생 정보 종료");
	public void start() {
//		Scanner sc = new Scanner(System.in);
//		StudentView studentview = new StudentView();
//		StudentService studentservice = new StudentService();
//		Student [] students = null;//Reference 타입은 초기값 null이다
		
		boolean check=true;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 학생 정보 종료");
			System.out.println("==============");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("1");
				students = studentservice.makeStudents();//변수 선언
				
				break;
			case 2 :
				System.out.println("2");
				studentview.view(students);
				
				break;
			case 3 :
				System.out.println("3");
				Student student = studentservice.findStudent(students);
				if(student != null) {
					studentview.view(student);	
				}else {
					studentview.view("일치하는 학생이 없습니다");
				}
				
				break;
			case 4 :
				System.out.println("4");
				
				break;
			case 5 :
				System.out.println("5");
				students = studentservice.addStudent(students);
				break;
			case 6 :
				System.out.println("6");
				break;
			default :
				break;
			}
		}
		
		
	}
}
