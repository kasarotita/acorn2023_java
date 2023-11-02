package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 *  1. run 했을 때
		 *     cherry, apple, banana, melon, 7
		 *     5개의 문자열 중에서 1개가 랜덤으로 출력되게 해 보세요.
		 *     
		 *     hint)
		 *     Random 객체와 String[] 객체를 활용해 보세요.
		 */
		
		String[] data = {"cherry", "apple", "banana", "melon", "7"};
		// 랜덤한 숫자를 얻어낼 수 있는 객체 생성
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		System.out.println(data[ranNum]);
		
		//int type 을 담을 방 3개짜리 배열 객체 생성
		new int[3];
		//배열 타입을 얻을려면 int[] nums = new int[3]; {0, 0, 0}
		//첫 번째에 10을 넣고 싶다면 nums[0]=10;
		
		//String type 을 담을 방 5개짜리 배열 객체 새성
		new String[5];
		//String strs = new String[5]; {null, null, null}
		//두 번째에 "kim"를 넣고싶다면 strs[1]="kim";
		
		//Car type 을 담을 방 4개짜리 배열 객체 생성
		new Car[4];
		//Car[] cars = new Car[4]; {null, null, null, null}
		//세 번째 방에 넣고싶다면 cars[2] = new Car();
		
	}

}
