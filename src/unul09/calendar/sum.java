package unul09.calendar;
import java.util.Scanner;
public class sum {
	
	public static void maxdays(int month) {
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, days[month-1]);
		System.out.println("");
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int month;
		
		getcal: while(true) {
			
			System.out.print("���� �Է��ϼ���. >");
			month = s.nextInt();
			
				switch(month) {
				case 1, 3, 5, 7, 8, 10, 12: 
					Calendar.Calendar31();
					break;
				
				case 2:
					Calendar.Calendar28();
					break;
				
				case 4, 6, 9, 11:
					Calendar.Calendar30();
					break;
					
				case -1:
					break getcal;
					
				default:
					System.out.println("����� �Է���~");
					
					
					
				}
			}
			
	s.close();
		}
		
			
	
	}


