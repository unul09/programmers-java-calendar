package unul09.calendar;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int [] days = {31,30,31,28,31,30,31,31,30,31,30,31};
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ݺ�Ƚ���� �Է��ϼ���. >");
		int repeat = s.nextInt();
		int [] months = new int[repeat];
		
		System.out.print("���� �Է��ϼ���. >");
		for(int i=0; i<repeat; i++) {
			months[i] = s.nextInt();
			if(months[i]<1 || months[i]>12) {
				System.out.println("����� �Է���!");
				i--;
				}			
		}
			
		
		
		
			for(int i=0; i<months.length; i++) {
				System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", months[i], days[months[i]]);
				System.out.println();
			}
			
			
			s.close();
		
		
		
		
		

	}

}
