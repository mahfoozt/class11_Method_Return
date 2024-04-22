package class11_Method_Return;

public class Quiz8 {

	public static void main(String[] args) {
		// Write a Method that reads a number as inches and Returns as Meter.
		// For example:
		// Test Input Result
		// Method Return
		// Test Input 50.0
		// 50.0 inches is = 1.27 Meters
		double inches=50.00;
		double result=InchesToMeter(inches);
		System.out.println(inches+"inches is = "+result+" Meters");
		
	}
	
	public static double InchesToMeter(double inche) {
		double meter=(1.27/50.0)*inche;
		return meter;
		
	}

}
