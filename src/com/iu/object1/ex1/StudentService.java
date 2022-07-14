package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc; //멤버 변수로 선언
	
	public StudentService() { //기본생성자 생성 후 다른메서드안에서도 실행 가능
		sc = new Scanner(System.in);
	}
	
	//addStudent (5번 누르면 이 메서드가 호출됨)
	//학생들의 정보를 받아서 (기존 모든 정보를 받아서)
	//학생 한명 추가
	//학생정보들을 리턴
	public void addStudent(Student [] students) {
		
		Student [] studentscp = new Student[students.length+1];
		
		for(int i=0; i<studentscp.length; i++) {
			Student student = new Student();
			
			System.out.println("추가할 이름을 입력하세요");
			student.name = sc.next();
			System.out.println("추가할 번호를 입력하세요");
			student.num = sc.nextInt();
			System.out.println("추가할 국어점수를 입력하세요");
			student.kor = sc.nextInt();
			System.out.println("추가할 영어점수를 입력하세요");
			student.egl = sc.nextInt();
			System.out.println("추가할 수학점수를 입력하세요");
			student.math = sc.nextInt();
			student.setTotal();
			student.setAvg();
		}
		
		
	}
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생(한명)을 리턴
	//없으면 null을 리턴하세요
	public Student findStudent(Student [] students) {
		
		Student student = null; //리턴하는 학생 데이터
		System.out.println("학생 번호를 입력해 주세요");
		int num = sc.nextInt();
		for(int i=0; i<students.length; i++) {
			if(num == students[i].num) {
				student = students[i];
				//return student; 이걸 써도 되고 break을 써도 된다
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
		
		//학생수는 숫자만
		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt();
		Student [] students = new Student[num];
		
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
			student.setTotal();
			student.setAvg();
			}
			return students;
	}
	
}
