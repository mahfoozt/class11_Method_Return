package class11_Method_Return;

public class Quiz_9 {

	public static void main(String[] args) {   
		int year=2020;
		boolean k=Leapyear(year);
		if(k == true) {
			System.out.println("Input  parameter is "+year);
			System.out.println("Leapyear");
			
		}else {
			System.out.println("Input  parameter is "+year);
			System.out.println("not Leapyear");	
		}		
		
	}

	public static boolean Leapyear(int year) {
		boolean result=year%4==0 &&year%100!=0||year%400==0;
		return result;
		
	}
		
} 
