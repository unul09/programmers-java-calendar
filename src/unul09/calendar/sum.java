package unul09.calendar;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("달을 입력하세요. >");
		int month = s.nextInt();
		
		if(month<1 || month>12)
			System.out.println("제대로 입력해!");
		
		else
			System.out.printf("%d월은 %d일까지 있습니다.", month, days[month-1]);
		
		
		
		
		
		

	}

}
