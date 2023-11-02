package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		//첫 번째
		Member m1=new Member();
		m1.num=1;
		m1.name="김구라";
		m1.addr="노량진";
		
		//두 번째
		Member m2=new Member(2, "해골", "행신동");
		
	}

}
