package java001_basic.prob;

/*
 *평년,윤년을 구하는 프로그램을 구현하시오.
 *1 윤년의 조건
 * 1) 년도를 4로 나눈 나머지가 0이고 100로 나눈 나머지가 0이 아니다.
 * 2) 년도를 400로 나눈 나머지가 0이다.
 * 
 * 2 [출력결과]
 *   2012년도는 윤년입니다.
 *   2013년도는 평년입니다.
 */

public class Prob04 {
	
	public static void main(String[] args) {
		int year=2012;
		char res = year % 4 == 0 && year % 100 != 0 || year % 400 == 0  ?'윤' : '평' ;
		System.out.println(year+"년도는 "+res+"년입니다");
		//여기에 작성하시오.
		
	}

}
