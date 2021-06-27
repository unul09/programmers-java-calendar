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
			System.out.println("�⵵�� �Է��ϼ��� ");
			System.out.print("YEAR> ");
			year = s.nextInt();
			if(year == -1) {
				System.out.print("bye!");
				break;}
			System.out.println("���� �Է��ϼ��� ");
			System.out.print("MONTH> ");
			month = s.nextInt();
			if(month == -1) {
				System.out.print("bye!");
				break;}
//			System.out.println("ù��° ������ �Է��ϼ���. (SU, MO, TU, WE, TH, FR, SA) ");
//			System.out.print("WEEKDAY> ");
//			weekday = s.next();
			
			
			if (month >12 || month<-1)
				continue;
			
			
			
			cal.printCalendar(year, month);
			
		
			}
		
		
		s.close();
		
	}

	public static void main(String[] args) {
		//�� ����
		Prompt p = new Prompt();
		p.runPrompt();	

	}

}
