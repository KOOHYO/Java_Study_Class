package com.iu.object2;

public class Method1 {

	//멤버 변수 선언 공식
	// 접근지정자 [그외지정자] 데이터타입 변수명; []<이 표시는 필요하면 써도 되고 안써도된다.
	
	//멤버 메서드 선언 공식
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){
	//		실행할 코드 작성
	//} 대괄호 표시 없는것은 필수로 써야하는것들이다.
	
	// 접근지정자 : public
	// 그외지정자 : 생략
	// 리턴타입	: void
	// 메서드명	: 각자 생성, 첫글자는 소문자로 시작
	// 메개변수	: 생략
	
	public void test () {
		System.out.println("Test Method 실행");
		int num = 10;
		System.out.println(num);
	}
	
}
