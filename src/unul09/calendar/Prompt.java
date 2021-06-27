package unul09.calendar;
import java.util.Scanner;
public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner s = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 1;
		String weekday = "";
		
		while(true) {
			System.out.println("년도을 입력하세요 ");
			System.out.print("YEAR> ");
			year = s.nextInt();
			System.out.println("달을 입력하세요 ");
			System.out.print("MONTH> ");
			month = s.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA) ");
			System.out.print("WEEKDAY> ");
			weekday = s.next();
			
			if(month == -1)
				break;
			else if (month >12)
				continue;
			
			
			
			cal.printCalendar(year, month, weekday);
			}
		
		
		s.close();
		
	}

	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();	

	}

}
