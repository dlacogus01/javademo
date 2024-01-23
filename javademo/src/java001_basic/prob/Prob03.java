package java001_basic.prob;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
		int total = 123;
		int record = 10;
		
		int res = total % record == 0 ? total/record : total/record + 1;
		System.out.println(res);
	
	  
     
      
	}//end main()

}//end class














