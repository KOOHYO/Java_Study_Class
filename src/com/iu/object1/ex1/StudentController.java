package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {

	//stat메서드를 선언
//	System.out.println("1. 학생 정보 입력");
//	System.out.println("2. 학생 정보 조회");
//	System.out.println("3. 학생 정보 검색");
//	System.out.println("4. 학생 정보 삭제");
//	System.out.println("5. 학생 정보 추가");
//	System.out.println("6. 학생 정보 종료");
	public void stat() {
		Scanner sc = new Scanner(System.in);
		StudentView studentview = new StudentView();
		StudentService studentservice = new StudentService();
		Student student = null;//new Student();
		Student [] students = null;//Reference 타입은 초기값 null이다
		
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
				studentview.viewAll(students);
				
				break;
			case 3 :
				System.out.println("3");
				student = studentservice.findStudent(students);
				if(student !== null) {
					studentview.viewOne(student);	
				}else {
					studentview.viewMessage("일치하는 학생이 없습니다");
				}
				
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
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
