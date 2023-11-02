package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//지역변수를 선언만 하면? (만들어 지지 않는다)
		int num; //int num; 은 성립하지 않음 왜냐 참조값이 없기 때문에
		String name1;
		
		int result = 10+num;
		System.out.println(name1); //참조값이 없기에 에러가 난다.
		
		//아직 만들어 지지 않았기 때문에 num1 은 참조 불가
		//int result = 10+num;
		//아직 만들어 지지 않았기 때문에 name1 은 참조 불가
		//System.out.println(name1);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}

}