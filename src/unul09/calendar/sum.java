package unul09.calendar;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("반복횟수를 입력하세요. >");
		int repeat = s.nextInt();
		int [] months = new int[repeat];
		
		System.out.print("월을 입력하세요. >");
		for(int i=0; i<repeat; i++) {
			months[i] = s.nextInt();
			if(months[i]<1 || months[i]>12) {
				System.out.println("제대로 입력해!");
				i--;
				}			
		}
			
		
		
		
			for(int i=0; i<months.length; i++) {
				System.out.printf("%d월은 %d일까지 있습니다.", months[i], days[months[i]]);
				System.out.println();
			}
			
			
			s.close();
		
		
		
		
		

	}

}
