package java001_basic;

public class Java012_operators {
		/*
		 * true && true => true
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 * 
		 *  true || true => true
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  
		 *  !true => false
		 *  !false => true
		 */
	public static void main(String[] args) {
		// 논리연산자
		//&& || : java
		// and or : python
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res ;
		
		res = x<y && x==z;  // true = true && true
		System.out.println(res); //true
		
	   res = x>y || x==z;   //true = false || true
	   System.out.println(res);  //true
	   
	   // java에서는 무조건 양변에 논리값이 와야 함
	   // res = 1 && x==z;
		

	}

}
