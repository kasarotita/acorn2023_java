package test.mypac;
/*
 *  Student()
 *  생성자를 call 하는 표현식
 *  constructor 를 call 하는 표현식
 *  클래스는 최소 하나의 constructor 를 가지고 있다.
 */

public class Student {
	// public Student(){} 생성자를 명시적으로 정의하지 않아도 위와 같은 default 생성자는 있다고 간주된다.
	// 따라서 생성자를 따로 만들지 않아도 new Student() 해서 객체를 생성할 수 있다!
	// 생략을 해도 문제가 되지않는다. 생략된 default 생성자 call!
	
	//생성자(constructor)
		public Student() {
			//객체를 생성하는 시점에 무언가 준비 작업을 하고 싶으면 여기서 한다.
			System.out.println("Student() 생성자 호출됨");

	public void study() {
		System.out.println("공부해요!");
	}

}
