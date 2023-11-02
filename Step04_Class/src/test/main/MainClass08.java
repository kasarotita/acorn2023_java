package test.main;

import test.mypac.Shape;

public class MainClass08 {
	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.width=100;
		s1.height=100;
		s1.printArea();
		
		Shape s2=new Shape();
		s2.width=20;
		s2.height=100;
		s2.printArea();
	}

}
