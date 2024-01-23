package java002_statements;

public class Java017_if {
	/*
	 * 조건식을 만족할때만 수행할 문장이 있는 경우
	 * if(조건식) {
	 *    수행할 문장;
	 * }
	 */
	public static void main(String[] args) {
		int num = 10;
		
		if  (num > 0) {
			System.out.printf("%d는 자연수입니다. \n", num);
		}
		
		System.out.printf("program end");
	}

}
