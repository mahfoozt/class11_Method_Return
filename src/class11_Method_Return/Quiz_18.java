package class11_Method_Return;

public class Quiz_18 {

	public static void main(String[] args) {
//		Write 3 Methods that read year, month, week as input parameter and returns total day
//		Input
//		3 weeks
//		4 month,1 week
//		1 year,3 month,2 weeks
//		Result
//		3 weeks is equivalent to 21 days
//		4 Months and 1 Weeks is equivalent to 127 days
//		1 Years, 3 Months and 2 Weeks is equivalent to 469 days
		int d= ConvertToDays(3);
		System.out.println("3 weeks is equivalent to " +d+ " days");
		int d1=ConvertToDays(4,1);
		System.out.println("4 Months and 1 Weeks is equivalent to " +d1+ " days");
		int d2=ConvertToDays(1,3,2);
		System.out.println("1 Years, 3 Months and 2 Weeks is equivalent to "+d2+ " days");
		
	}
	public static int ConvertToDays(int w) {
		int day=7*w;
		return day;	
	}
	public static int ConvertToDays(int m, int w){
		int day=30 * m + 7 * w;
		return day;
	}
	public static int ConvertToDays(int y, int m, int w) {
		int day=365*y + 30*m +7*w;
		return day;
	}


}
