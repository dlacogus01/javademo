package java001_basic;

public class Java009_operators {
	/*
	 * 증감연산자 : 증가연산자(++), 감소연산자(--)
	 * 전위연산자 : 증감연산자가 변수 앞에 있을 때
	 * 후위연산자 : 증감연산자가 변수 뒤에 있을 때
	 */
	public static void main(String[] args) {
		int x = 3;
		
		// 전위연산자
		++x; // x = x + 1
		System.out.println("x=" + x);
		
		--x; // x = x - 1
		System.out.println("x=" + x);
		
		// 후위연산자
		int y = 5;
		y++; // y = y + 1
		System.out.println("y=" + y);
		
		y--; // y = y - 1
		System.out.println("y=" + y);
		
		// 리터널은 증감연산자를 사용할 수 없음
		// 10++;
		
		// 상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4;
		// 상수는 새로운 값을 할당 할 수 없음
		// NUM = 10;
		// 상수는 증감연산자를 사용할 수 없음
		// NUM++;
		System.out.println("NUM=" + NUM);
		
		
	}

}
