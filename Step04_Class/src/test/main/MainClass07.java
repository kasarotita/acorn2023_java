package test.main;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		//Member 클래스로 객체로 생성하고 참조값을 mem1 이라는 지역변수에 담기
		Member mem1=new Member();
		//1번 회원의 정보를 담아보세요
		mem1.addr="행신동";
		mem1.name="김구라";
		mem1.num=1;
		//Member 클래스로 객체로 생성하고 참조값을 mem2 이라는 지역변수에 담기
		Member mem2=new Member();
		//2번 회원의 정보를 담아보세요.
		mem2.addr="동물원";
		mem2.name="원숭이";
		mem2.num=2;
		
		mem1.showInfo();
		mem2.showInfo();
			
		}
	}
