package test.main;

public class MainClass04 {
	//static 메소드 안에서 사용하려면 static 예약어가 필요!
	public class Gura{
		public void say() {
			System.out.println("안녕! 나는 구라야!");
		}
	}
	
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		
		class Cat{
			public void say() {
				System.out.println("야옹~");
			}
		}
		
		Cat c = new Cat();
		c.say();
	}

}

// 클래스 내부에 만든 클래스는 내부 클래스 (Inner Class)
// 메소드 내부에도 클래스를 정의할 수 있다. 메소드 내부에서만 사용 가능함. (Local Inner Class) - 지역 내부 클래스