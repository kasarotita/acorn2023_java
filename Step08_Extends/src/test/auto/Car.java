package test.auto;

/*
 *  public : 어디에서나 접근 가능
 *  protected : 동일한 package 혹은 상속관계나 자식관계에 접근 가능 / package 가 달라도 상속관계이면 접근 가능
 *  default(작성 안한 경우) : 동일한 package 안에서만 접근 가능
 *  private : 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 *  
 *  객체나 접근 지정자가 다르면 오류남
 *  
 *  - 접근 지정자를 붙이는 위치
 *  
 *  1. 클래스를 선언 할 때
 *  2. 생성자
 *  3. 필드
 *  4. 메소드
 *  
 *  클래스는 default 와 public 두 가지의 접근 지정자만 지정 가능하다
 *  접근 지정자를 생략한 것이 default 접근 지정자다
 */

public class Car {
	//필드
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴 수가 없어요!");
			return; //메소드를 여기서 리턴시키기(종료 시키기)
		}
		System.out.println("달려요!");
	}

}

	//클래스, 필드, 생성자, 메소드 에는 접근 지정자를 붙인다.
	//접근 지정자는 4가지 이다.
	//public(아무대나), protected, x(default), private(동일 클래스나 객체, 보호받겠다)
	
	//new Car(); x => new Car( new Engine() ); o
	//Engine e1 = new Engine(); => new Car(e1); 변수에 값이 있으면 이렇게 쓸 수 있다.
	