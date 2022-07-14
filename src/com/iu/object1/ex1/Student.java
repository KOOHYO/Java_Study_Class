package com.iu.object1.ex1;

public class Student {

	String name;
	int num;
	int kor;
	int egl;
	int math;
	int total;
	double avg;
	
	public void setTotal() {//여기에 매개변수로 total을써도 중복선언이 아님, 메모리 지역이 다르기때문에 변수명이 보라색이면 지역변수
		total = this.kor+egl+math;//여기에 this.이 생략되어있다. 그래도 에러가 안생김(주소를 담고있는 참조변수)
		//매개변수를 total로쓰고 안에 선언된 total을 멤버변수로쓰고싶으면 앞에 this를 쓰면 된다.
		this.setAvg();//메서드 호출도 가능하다
	}
	
	public void setAvg() {
		this.avg = this.total/3.0;//파란색은 멤버변수
	}
}
