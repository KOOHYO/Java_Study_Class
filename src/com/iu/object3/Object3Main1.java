package com.iu.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();//5 랜덤한 숫자가 올것
		System.out.println(num);

		System.out.println("======================");
		int [] nums =rt.makeRandom2(10);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=====================");
		Account coustomer = rt.makeAccount();
		System.out.println(coustomer.title);
		System.out.println(coustomer.host);
		System.out.println(coustomer.numbers);
		System.out.println(coustomer.balance);
	}

}
