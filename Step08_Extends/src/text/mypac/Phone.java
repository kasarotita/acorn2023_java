package text.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone extends Object {
	
	public Phone() { // 어떤 클래스도 상속받지 않으면 자동으로 extends Object가 된다.
		System.out.println("Phone 생성자 호출됨");
	}
	
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
		
		//HandPhone => Phone => Object 순서
	}

}
