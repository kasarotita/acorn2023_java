package text.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass08 {
	//Car 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담아보세요.
	Car car1 = new Car( new Engine ());
	//car1 에 . 찍어서 drive() 메소드를 호출해 보세요.
	car1.drive();
	
	Car car2=new Car(null);
	car2.drive();
	

}
