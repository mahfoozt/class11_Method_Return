package class11_Method_Return;

public class Quiz_18_MR {
	public String a="Hellow";
	public String b="Bangladesh";
	public static void main(String[] args) {
//Write a Method that reads a number as whole number and Sum up all previous digits.
//		Input
//		sumsUp(6)
//		Result
//		6+5+4+3+2+1=21
		int num = 6;
		int result = sumUp(num);
		System.out.print("=" + result);			
	}	
	public static int sumUp(int num) {
		int sum=0;
		for(int i=6; i>=1; i--) {
			sum=sum+i;
			System.out.print(i);
			if(i!=1) {
			System.out.print("+");
			}
				
		}
		return sum;		
	}     

}
