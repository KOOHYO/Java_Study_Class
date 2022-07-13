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
		
		boolean check=true;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 학생 정보 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("1");
				StudentService studentService = new StudentService();
				studentService.makeStudents();
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
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
