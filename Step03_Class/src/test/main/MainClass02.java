package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 car1 이라는 Car type 지역변수에 담기
		Car car1=new Car(); // id23로 참조값이 됨 name : null, price : 0, drive(){} 
		                   //0참조값으로 바뀜, new Car() 는 id23이 된다.
		//Car 클래스로 객체를 생성해서 참조값을 car1 이라는 Car type 지역변수에 담기
		Car car2=new Car(); // id25라 가정하자
		//Car car3 = null; 은 비어있는 상태임으로 만들어지지 않음 지역변수 car3가 만들어짐
		//car3 = car2; 는 car2가 car3에 들어가서 i25가 됨
		
		//필드에 String type 의 참조값 대입하기
		car1.name="소나타";
		car2.name ="그랜저";
		
		
		//메소드 호출하기
		car1.drive();
		car2.drive();
		
		//다른 객체 임으로 false 이다. car1 참조값은 id23 이고 car2 참조값은 id25 기 때문에 다르다.
		boolean result = car1 == car2;
		
		Car car3=car2;
		car3.drive(); //그랜저가 달린다
		
		//동일객체(car2 와 car3 에 저장된 참조값이 같다) 임으로 true 이다
		boolean result2 = car2 == car3;
	}

}
