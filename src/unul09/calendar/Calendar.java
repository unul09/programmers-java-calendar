package unul09.calendar;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,31,30,31,30,31};
	
	public static int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public static void printCalendar(int year, int month) {
		System.out.printf("    <<%4d��%3d��>>", year, month);
		System.out.println();
		System.out.println("��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1; i<= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0)
				System.out.println();
		}		
		System.out.println();

	}
	

}
