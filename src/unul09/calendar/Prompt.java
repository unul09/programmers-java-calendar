package unul09.calendar;
import java.util.Scanner;
public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner s = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while(true) {
			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			month = s.nextInt();
			
			if(month == -1)
				break;
			else if (month >12)
				continue;
			
			cal.printCalendar(2017, month);
			}
		
		
		s.close();
		
	}

	public static void main(String[] args) {
		//�� ����
		Prompt p = new Prompt();
		p.runPrompt();	

	}

}
