package main;

public class Conversions {
	
	// Cups to teaspoon
	public static void cupConversion(double amount) {
		double conversion = amount * 48.00;
		System.out.println(conversion + " Teaspoons");
		return;
	}
	
	//teaspoon to cups
	public static void teaConversion(double amount) {
		double conversion = amount / 48;
		System.out.println(conversion + " Cups");
		return;
	}
	
	//gallons to liters
	public static void galConversion(double amount) {
		double conversion = amount * 3.785;
		System.out.println(conversion + " Liters");
		return;
	}
	
	//liters to gallons
	public static void litConversion(double amount) {
		double conversion = amount / 3.785;
		System.out.println(conversion + " Gallons");
		return;
	}
	
	//miles to kilometers
	public static void mileConversion(double amount) {
		double conversion = amount * 1.60934;
		System.out.println(conversion + " Kilometers");
		return;
	}
	
	//kilometers to miles
	public static void kilomConversion(double amount) {
		double conversion = amount / 1.609;
		System.out.println(conversion + " Miles");
		return;
	}
	
	//miles to nautical miles
	public static void mileNautConversion(double amount) {
		double conversion = amount / 1.151;
		System.out.println(conversion + " Nautical Miles");
		return;
	}
	
	//nautical miles to miles
	public static void nautConversion(double amount) {
		double conversion = amount * 1.151;
		System.out.println(conversion + " Miles");
		return;
	}
}
