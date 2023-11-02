package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  구라쌤이 HandPhone 객체는 3가지 type 을 가지고 있다고 했는데 정말 맞을까?
		 */
		
		//HandPhone 객체는 3개의 type 을 가지고 있다. / 다형성 (type이 여러 개)
		//HandPhone 객체를 생성해서 나온 참조값을 HandPhone type 지역변수 p1 에 담기
		HandPhone p1 = new HandPhone();
		//HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2 에 담기
		Phone p2 = new HandPhone();
		//HandPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3 에 담기
		Object p3 = new HandPhone(); //사용설명서가 Object 니까 Object 밖에 사용 못한다. ex) p3.
		
	}

}
