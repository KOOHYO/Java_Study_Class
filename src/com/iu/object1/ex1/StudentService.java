package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {

	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생(한명)을 리턴
	//없으면 null을 리턴하세요
	public Student findStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = null; //리턴하는 학생 데이터
		System.out.println("학생 번호를 입력해 주세요");
		int num = sc.nextInt();
		for(int i=0; i<students.length; i++) {
			if(num == students[i].num) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	//makeStudents
	//학생수를 입력 받고
	//학생 수 만큼 정보를 입력 받고(이름, 번호, 국어, 영어, 수학)
	//학생들을 리턴
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);
		//학생수는 숫자만
		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt();
		Student [] students = new Student [num];
		
		for(int i=0; i<num; i++) {
			Student student = new Student();
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
			student.avg = student.total/3;
			students[i] = student;
			}
			return students;
	}
	
}
