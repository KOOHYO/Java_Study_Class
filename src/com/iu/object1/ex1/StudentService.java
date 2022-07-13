package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {

	//makeStudents
	//학생수를 입력 받고
	//학생 수 만큼 정보를 입력 받고(이름, 번호, 국어, 영어, 수학)
	//학생들을 리턴
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학생수를 입력하세요");
		int numbers = sc.nextInt();
		Student [] students = new Student [numbers];
		
		for(int i=0; i<numbers; i++) {
			System.out.println("이름을 입력하세요");
			student.name = sc.next();
			System.out.println("번호를 입력하세요");
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요");
			student.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			student.egl = sc.nextInt();
			System.out.println("수학점수를 입력하세요");
			student.math = sc.nextInt();
			student.total = student.kor+student.egl+student.math;
			System.out.println("총점수는 : "+student.kor+student.egl+student.math);
			System.out.println("평균는 : "+student.total/3);
			students[i] = student;
			
			}
			return students;
	}
	
}
