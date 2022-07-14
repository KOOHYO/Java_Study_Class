package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Student student = new Student();
//		student.name = "지용";
//		student.num = 1;
//		student.kor = 100;
//		student.egl = 100;
//		student.math = 100;
//		student.total = student.kor+student.egl+student.math;
//		student.avg = student.total/3;
//		
//		System.out.println(student.name);
//		System.out.println(student.num);
//		System.out.println(student.kor);
//		System.out.println(student.egl);
//		System.out.println(student.math);
//		System.out.println(student.total);
//		System.out.println(student.avg);
//		
//		Student student2 = new Student();
//		Student student3 = new Student();
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i=0; i<3; i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.setName(sc.next());
			students[i]=st;
		}
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
		
		System.out.println(st.getName());
		
		System.out.println("프로그램 종료");
	}

}
