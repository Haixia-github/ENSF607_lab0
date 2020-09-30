public class Converter {
	//Your names go here: Haixia Wu
	/*
	 * @Author: Haixia Wu
	 * Haixia Wu_2
	 * Haixia Wu_3
	 *
	 */
	private double celsiusToFahrenheit(double C){
		// TODO: The third student will implement this method
		return 0;
	}

	private double fahrenheitToCelsius(double F){
		// TODO: The second student will implement this method
		return (5 *(F -32) /9);
	}

	public static void main(String[] args) {
		//TODO: The first student will implement this method.
		Converter test = new Converter();
		// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
		double valueFahren = test.celsiusToFahrenheit(180);
		System.out.println("convert 180 Celsius to Fahrenheit value: "+ String.format("%.2f", valueFahren));
		// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
		double valueCelsius = test.fahrenheitToCelsius(250);
		System.out.println("convert 250 Fahrenheit to Celsius value: "+ String.format("%.2f", valueCelsius));
	}
}