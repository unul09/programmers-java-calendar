package unul09.calendar;
import java.util.Scanner;
public class sum {
	
	public static void maxdays(int month) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, days[month-1]);
		System.out.println("");
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int month;
		
		while(true) {
			
			System.out.print("���� �Է��ϼ���. >");
			month = s.nextInt();
			if(month == -1) {
				System.out.println("������ �ǽÿ�");
				break;
			}
			else if (month<1 || month>12)
				System.out.println("����� �Է���!");
			else
				maxdays(month);
	
		}
		s.close();
			
	
	}

}
