package unul09.calendar;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���. >");
		int month = s.nextInt();
		
		if(month<1 || month>12)
			System.out.println("����� �Է���!");
		
		else
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, days[month-1]);
		
		
		
		
		
		

	}

}
