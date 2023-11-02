package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		// java 에서 제공하는 클래스로 객체(필드 or 메소드로 이루어져있다) 생성
		// 객체 생성 후 참조값을 Random type 지역변수 ran 에 담기
		Random ran=new Random();
		
		//정수 범위 내에서 랜덤한 정수 하나 얻어내기
		int ranNum=ran.nextInt();
		System.out.println(ranNum);
		
		//0 이상 10 미만 범위 내에서 랜덤한 정수 하나 얻어내기 (0~9) 사이의 랜덤한 정수 얻어내기
		int ranNum2=ran.nextInt(10);
		System.out.println(ranNum2);
		
	}

}
