package com.iu.object2;

public class Method3 {

	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
		salary=20;
		
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//info Method 선언 : 이름 나이 이메일주소를 받아서 출력
	//메인에서 호출해서 제대로 나오는지 확인
	public void info(String name, int age, String email) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("이메일 : "+email);
	}
	
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		member.age = 100;
	}
	
}
