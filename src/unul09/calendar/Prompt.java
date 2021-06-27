package unul09.calendar;
import java.util.Scanner;
public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner s = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 1;
		
		while(true) {
			System.out.println("년도을 입력하세요 ");
			System.out.print("YEAR> ");
			year = s.nextInt();
			System.out.println("달을 입력하세요 ");
			System.out.print("MONTH> ");
			month = s.nextInt();
			
			if(month == -1)
				break;
			else if (month >12)
				continue;
			
			cal.printCalendar(year, month);
			}
		
		
		s.close();
		
	}

	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();	

	}

}
