package java002_statements.prob;

/*
 * switch~case문을 이용해서 년도에 해당하는 띠를 구하는 프로그램을 구현하시오.
 *  1. 12가지 띠
 *     원숭이, 닭, 개, 돼지, 쥐, 소, 호랑이, 토끼,용, 뱀, 말, 양
 *  2 띠구하는 공식
 *    year%12의 결과가
 *    0이면 "원숭이",면 " 1이면 "닭"  2이면 "개",    3이면 "돼지",
 *    4이면 "쥐",    5이면 "소", 6이면 "호랑이", 7이면 "토끼",
 *    8이면 "용",    9이면 "뱀", 10이면 "말",   11이면 "양"
 *    
 *  3 출력결과
 *    2012년도의 태생은  용띠입니다.  
 */

public class Prob01 {

	public static void main(String[] args) {
		int year=2012;	
		String animal = "";

		switch(year % 12){
		case 0:
			animal = "원숭이";
			System.out.println(year+"년도의 태생은" + animal + "띠입니다.");
			break;
		case 1:
			System.out.println(year+"년도의 태생은 닭띠입니다.");
			break;
		case 2:
			System.out.println(year+"년도의 태생은 개띠입니다.");
			break;
		case 3:
			System.out.println(year+"년도의 태생은 돼지띠입니다.");
			break;
		case 4:
			System.out.println(year+"년도의 태생은 쥐띠입니다.");
			break;
		case 5:
			System.out.println(year+"년도의 태생은 소띠입니다.");
			break;
		case 6:
			System.out.println(year+"년도의 태생은 호랑이띠입니다.");
			break;
		case 7:
			System.out.println(year+"년도의 태생은 토끼띠입니다.");
			break;
		case 8:
			animal = "용";
			System.out.println(year+"년도의 태생은 용띠입니다.");
			break;
		case 9:
			System.out.println(year+"년도의 태생은 뱀띠입니다.");
			break;
		case 10:
			System.out.println(year+"년도의 태생은 말띠입니다.");
			break;
		case 11:
			System.out.println(year+"년도의 태생은 양띠입니다.");
		}
		
		
		

	}//end main()

}//end class
