package com.iu.object4;

public class ObjectMain4 {

	public static void main(String[] args) {
		Resume resume = new Resume();//객체를 만들때 생성자를 호출
		Car car1 = new Car();//기본 생성자를 만들어줌
		//car1.brand = "토레스";
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();

	}

}
