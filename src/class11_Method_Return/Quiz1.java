package class11_Method_Return;

public class Quiz1 {

	public static void main(String[] args) {			
			//	For example:
			//	Test	Input	Result
			//	72.0 degree Fahrenheit is equal to 22.22 in Celsius
			//10.0 degree Celsius is equal to 50.0 in Farenheit 
			double C=10.0;
			double F =72.0;
			String result1 =FahrenheiteToCelsius(F);
			double result2=CelsiusToFarenheit(C);
			System.out.println(F+" degree Fahrenheit is equal to "+result1+" in Celsius");
			System.out.println(C+" degree Celsius is equal to "+result2+" in Fahrenheit");
		}
			public static String FahrenheiteToCelsius(double f) {
				double c=(f-32)*5/9;
				//return c;
				return String.format("%.2f",c);
			}

			public static double CelsiusToFarenheit(double c) {
				double f=(9*c)/5+32;
				return f;
			}

}
