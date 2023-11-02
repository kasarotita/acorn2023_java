package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	//default 생성자
	public Member() {}
	//int, String, String type 을 전달 받는 생성자
	
	/*
	 *  Member m=new Member();
	 *  m.num=1;
	 *  m.name="kim";
	 *  m.addr="seoul";
	 *  
	 *  Member m2=new Member(1,"kim","seoul");
	 */
	
	// public Member() {} 이런 모양의 생성자가 있다.
	
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	
	//메소드
	public void printInfo() {
		System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
	
	// 생성자를 호출할 때 갯수와 타입을 맞춰야한다.	
		
	
	}

}
