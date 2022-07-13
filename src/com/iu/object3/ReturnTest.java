package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	//makeAccount
	//title 통장이름, host 예금주, 계좌번호, 잔액을 입력받음(메서드호출해서 리턴받음)
	public Account makeAccount() {
		Scanner sc = new Scanner(System.in);
		Account customer = new Account();
		System.out.println("은행명을 입력하시오");
		customer.title = sc.next();
		System.out.println("예금주를 입력하시오");
		customer.host = sc.next();
		System.out.println("계좌번호를 입력하시오");
		customer.numbers = sc.next();
		System.out.println("잔액을 입력하시오");
		customer.balance= sc.nextLong();
		
		return customer;
	}
	
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRandom2(int count) {
		Random random = new Random();
		int [] nums = new int[count];

		for(int i=0; i<count; i++) {
//			int num = random.nextInt(50);
//			nums[i] = num;
			nums[i] = random.nextInt(50);
			
		}
		
		
		return nums;
	}
	
	public int makeRandom() {
		Random random = new Random(); //객체 만들기
		int num = random.nextInt(50);
		
		//return 리턴하려는 Data
		return num; //, 쓰고 다른 하나를 더 쓸 수 없음 선언부와 똑같은 데이터 타입을 써야함 단 자동형변환 할 수 있는건 가능
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
	
}
