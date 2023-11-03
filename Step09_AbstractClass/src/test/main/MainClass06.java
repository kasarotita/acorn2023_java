package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		//class A{ 클래스 / {} => 클래스다. 이름이 없는 익명 클래스 extends Weapon 된 클래스
		//new Weapon() 은 익명클래스의 생성자를 call 하는 표현식
		//}
		// Weapon w1 = new Weapon() { // new Weapon() 생성자를 call 하는 걸로 간주한다.
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("아무나 공격하자!");
				
				
			}
		};
		
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("지겹다 아무나 공격하자");
				
			}
		});

			@Override
			public void attack() {
				System.out.println("오잉? 공격하자~");
			}
			
			/*
			 *  class ? extends Weapon{
			 *  @Override
			    public void attack(){}
			    }
			 */
			
		};
		
	}
	
	//Weapon type 의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.attack();
		w.prepare();
		w.attack();
	}

}
