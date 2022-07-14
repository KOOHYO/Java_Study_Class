package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//sc는 Reference 타입이고 지역변수이면서 참조변수라 불린다.
		Student [] students = new Student[3];
		
		for(int i=0; i<students.length; i++) {
			Student st = new Student();
			students[i] = st;
			System.out.println("이름 입력");
			//students[i].name = sc.next();
			st.setName(sc.next());
		}
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].getName());
		}
	}

}
