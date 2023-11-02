package text.main;

import text.mypac.HandPhone;
import text.mypac.Phone;
/*
 *  지역변수나 필드 앞에 선언하는 data type 은 (참조 데이터 type)
 *  
 *  그 안에 들어잇는 참조값의 사용 설명서 라고 생각하면 된다.
 *  
 *  그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용할 수 있다.
 *  
 *  java 의 모든 객체는 다형성을 가질 수 있다.
 *  
 *  다형성은 type 이 여러 개라는 의미이다.
 */

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