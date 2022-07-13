package com.iu.object2;

public class Method4 {
	
	public void info(Member [] members) {
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
		}
	
		members = new Member[2];
		
	}
	
}
