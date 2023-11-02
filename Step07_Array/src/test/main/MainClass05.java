package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		//콘솔창으로 부터 문자열을 읽어들이기 위한 객체 생성
		Scanner scan=new Scanner(System.in);
		//개행기호를 출력하지 않고 콘솔창에 문자열 출력하기             .print() 메소드를 활용하면 된다.
		System.out.print("여기에 문자열 입력:");
		//문자열을 한줄 입력 받고
		String str=scan.next();
		//콘솔창으로 부터 문자열 읽어들이기
		//입력 받은 문자열을 콘솔에 출력해보기
		System.out.println(str);
		System.out.println("main 메소드가 종료 됩니다");
	}

}
