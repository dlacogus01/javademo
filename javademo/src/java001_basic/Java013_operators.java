package java001_basic;

public class Java013_operators {
	/*
	 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
	 * 산술 > 비교 > 논리 > 조건 > 대입
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		
		boolean res;
		
		// && 연산자의 좌변이 false이면 우변은 수행하지 않음
		res = (++a > b) && (++b < c);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res);
	
		int x = 4;
		int y = 8;
		int z = 10;
		
		// || 연산자의 좌변이 true이면 우변은 수행되지 않음
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x, y, z, res);
	
		int k = 1;
		int m = 2;
		int n = 3;
		
		// 1) k==2 -> false
		// 2) k==2 && ++m == 2 -> false
		// 3) ++n -> 4
		// 4) ++n ==4 -> true
		// 5) res = k==2 && ++m == 2 || ++n ==4 ->true
		// 6) res = true
		
		res = k==2 && ++m == 2 || ++n ==4;
		System.out.printf("k=%d, m=%d,n=%d, res=%b\n", k, m, n, res);
	
		k = 1;
		k = 2;
		k = 3;
		res = k==2 && ++m == 2 || ++n ==4;
		System.out.printf("k=%d, m=%d,n=%d, res=%b\n", k, m, n, res);
	}

}
