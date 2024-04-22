package class11_Method_Return;

public class Quiz24_Tax {

	public static void main(String[] args) {
		double grossIncome;
		grossIncome=200.0;
		
		double taxRate=35.0;
		double taxAmount=getTaxAmount(grossIncome,taxRate);
		double netIncome=grossIncome-taxAmount;
		System.out.println("Net income is "+netIncome);
	}
	public static double getTaxAmount(double grossIncome,double taxRate) {
		double taxAmount =grossIncome*(taxRate/100);
		return taxAmount;
	}

}
