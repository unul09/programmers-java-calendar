package unul09.calendar;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	private static final String[] WEEKDAYS = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
	
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0)
			return true;
		else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
			return true;
		else
			return false;
	}
	public static int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) 
			return LEAP_MAX_DAYS[month-1];
			
		
		else
			return MAX_DAYS[month-1];
	}
	
	public static int blankCount(String weekday) {
		int k = 99;
		doo: for(int i = 0; i < 7; i++) {
		if(WEEKDAYS[i].equals(weekday)){
			k= i; //k는 해당 요일의 인덱스
			break doo;
		}		
		}
		return k;
	
	}

	public static void printCalendar(int year, int month, String weekday) {
		System.out.printf("    <<%4d년%3d월>>", year, month);
		System.out.println();
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int blank = blankCount(weekday);
		
		for(int i = 0; i< blank; i++) 
			System.out.print("   ");
		
		for(int i = 1; i<= maxDay; i++) {			
			System.out.printf("%3d",i);
			
			if((i+blank) % 7 == 0)
				System.out.println();
		}		
		System.out.println();

	}
	

}
