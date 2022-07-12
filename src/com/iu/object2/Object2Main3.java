package com.iu.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		Method3 mt3 = new Method3();
		//월급 입력
		int salary = 5000000;
		mt3.sal(salary);//인자 값을 Method3에 보냄
		System.out.println(salary);
		//mt3.hap(10, 20);
		
		mt3.info("지용", 20, "asdf1234");//순서 맞아야함
		
		Member member = new Member();
		member.name = "주혁";
		member.age = 30;
		member.email = "asdf1234@naver.com";
		mt3.info2(member);
		System.out.println(member.age);
	}

}
