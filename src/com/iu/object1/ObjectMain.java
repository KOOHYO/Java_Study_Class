package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명();
		//데이터타입 변수명
		//객체하나 생성 몬스터 한마리 생성 변수명monster에는 Heap의 ※ 주소가 담겨있음 ※ 그러므로 Reference 타입이다
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버변수 접근 (가지고있다)
		//변수명.멤버변수명
		System.out.println(monster.name);//Reference타입의 초기값은 null : 아무것도 없다, 참조할 주소가 없다 
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name = "오크";
		monster.hp = 100;
		monster.level = 5;
		System.out.println(monster.name); 
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//---------------------------------------------
		Monster monster2 = new Monster();
		monster2.name = "오크";
		monster2.level = 5;
		monster2.hp = 100;
		System.out.println(monster2==monster);//주소를 비교하기때문에 다르다
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inshant = 1;
		
		monster.weapon = sword;
		System.out.println(monster.weapon.name);//monster는 참조변수, 지역변수(스텍에 선언되어있어서), 여기서 weapon은 참조변수이면서 인스턴스변수(힙에 선언되어있어서)
		
		System.out.println(monster2.weapon.name);
		
		System.out.println("프로그램 종료");
	}

}
