package com.iu.object1.ex1;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력하는 메서드
	public void view(String message) {
		System.out.println(message);
	}
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력하는 메서드
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getKor());
		System.out.println(student.getEgl());
		System.out.println(student.getMath());
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
	}
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력하는 메서드다
	public void view(Student [] students) {
		
		for(int i=0; i<students.length;i++) {
			System.out.println("이름은 : "+students[i].getName());
			System.out.println("번호는 : "+students[i].getNum());
			System.out.println("국어는 :"+students[i].getKor());
			System.out.println("영어는 :"+students[i].getEgl());
			System.out.println("수학은 :"+students[i].getMath());
			System.out.println("총점는 :"+students[i].getTotal());
			System.out.println("평균은 :"+students[i].getAvg());
			
		}

	}
	
}
