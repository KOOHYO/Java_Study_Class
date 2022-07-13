package com.iu.object1.ex1;

public class StudentView {

	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력하는 메서드다
	public void viewAll(Student [] students) {
		
		for(int i=0; i<students.length;i++) {
			System.out.println("이름은 : "+students[i].name);
			System.out.println("번호는 : "+students[i].num);
			System.out.println("국어는 :"+students[i].kor);
			System.out.println("영어는 :"+students[i].egl);
			System.out.println("수학은 :"+students[i].math);
			System.out.println("총점는 :"+students[i].total);
			System.out.println("평균은 :"+students[i].avg);
		}

	}
	
}
