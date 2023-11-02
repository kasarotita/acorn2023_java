package test.mypac;
/*
 *  Member 객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Memer 클래스를 설계 하려고 한다.
 *  상품번호, 상품명, 가격, 글번호, 글제목, 글내용, 조회수, 회원의 아이디, 이메일, 등급,
 *  사원번호, 사원이름, 부서번호, 부서명, 부서의 위치.... 등등 담을 수 있다.
 *  번호는 스트링 타입
 */

public class Member {
	//int type 을 담을 필드
	public int num;
	//String type 을 담을 필드
	public String name;
	public String addr;
	//메소드
	public void showInfo() {
		//int num=100; 이럴 경우에는 this 를 사용한다.
		//this 는 나의 (바로 이 객체) 참조값을 가리킨다. this. 은 생략이 가능하다.
		String info="번호는 "+this.num+" 이고 이름은 "+this.name+" 이고 주소는 "+addr+" 입니다.";
		System.out.println(info);
		
		//Member a=this;
	}

}
