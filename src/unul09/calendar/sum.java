package unul09.calendar;
import java.util.Scanner;
public class sum {
	
	public static void maxdays(int month) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		System.out.printf("%d월은 %d일까지 있습니다.", month, days[month-1]);
		System.out.println("");
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int month;
		
		while(true) {
			
			System.out.print("월을 입력하세요. >");
			month = s.nextInt();
			if(month == -1) {
				System.out.println("좋은날 되시우");
				break;
			}
			else if (month<1 || month>12)
				System.out.println("제대로 입력해!");
			else
				maxdays(month);
	
		}
		s.close();
			
	
	}

}
