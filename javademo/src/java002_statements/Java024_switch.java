package java002_statements;

public class Java024_switch {

	public static void main(String[] args) {

		enum Day{
			MONDAY, TUSEDAY, WENDESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; 
		}
		
		Day day = Day.MONDAY;
		
		switch(day) {
		case MONDAY:
			System.out.println("월");
			break;
		case TUSEDAY:
			System.out.println("화");
			break;
		case WENDESDAY:
			System.out.println("수");
			break;
		case THURSDAY:
			System.out.println("목");
			break;
		case FRIDAY:
			System.out.println("금");
			break;
		case SATURDAY:
			System.out.println("토");
			break;
		case SUNDAY:
			System.out.println("일");
		}
	}

}
