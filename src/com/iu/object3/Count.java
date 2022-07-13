package com.iu.object3;

public class Count {

	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(int num1, double num2) {
		System.out.println(num1+num2);//중복 선언이 아니다! OverRoading같은이름의 메서드를 여러개 쓰는것
	}
	
	public void hap(int num1, int num2, int num3) {
		System.out.println(num1+num2);
	}
	
//	public int hap(int num1, int num2) {
//		System.out.println(num1+num2); 리턴 타입과는 상관 없다!! 이것은 에러
//	}
}
