package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {

		Member member = new Member();
		member.name = "지용";
		member.age = 20;
		member.email = "asdf1234@naver.com";
		
		Member member2 = new Member();
		member2.name = "효경";
		member2.age = 25;
		member2.email = "asdf5678@naver.com";
		
		Member member3 = new Member();
		member3.name = "본영";
		member3.age = 23;
		member3.email = "asdf910@naver.com";
		
		Member [] members = new Member[3];
		Method4 mt4 = new Method4();
		
		members [0] = member;
		members [1] = member2;
		members [2] = member3;
		
		mt4.info(members);
		
		System.out.println(members.length);
		
	}

}
