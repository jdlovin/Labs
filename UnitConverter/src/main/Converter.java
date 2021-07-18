package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		int menuSelection = -1;
		while(menuSelection != 5) {
			System.out.println("Please select an option: ");
			System.out.println("1. Volume Conversion");
			System.out.println("2. Distance Conversion");
			System.out.println("3. Quit");
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter 1, 2, 3, or 4");
			if(scanner.hasNextInt());
			menuSelection = scanner.nextInt();
		
			
			switch(menuSelection) {
			case 1:
				//Volume Conversions 
				
				System.out.println("Volume Conversions");
				System.out.println("Select one of the following:");
				System.out.println("1. Cups to Teaspoon");
				System.out.println("2. Teaspoon to Cups");
				System.out.println("3. Gallons to Liters");
				System.out.println("4. Liters to Gallons");
				Scanner volScanner = new Scanner(System.in);
				System.out.println();
				System.out.println("Enter 1, 2, 3, or 4");
				menuSelection = volScanner.nextInt();
				
					switch(menuSelection) {
					case 1:
						//cups to teaspoon
						
						System.out.println("Cups to Teaspoon"); 
						Scanner cupScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many cups?");
						double fromCups = cupScanner.nextInt();
						Conversions.cupConversion(fromCups);
						break;
					case 2:
						//Teaspoon to cups
						
						System.out.println("Teaspoon to Cups");
						Scanner teaScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many teaspoons?");
						int fromTSpoon = teaScanner.nextInt();
						Conversions.teaConversion(fromTSpoon);
						break;
					case 3:
						//Gallons to liters
						
						System.out.println("Gallons to Liters");
						Scanner galScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many gallons?");
						int fromGallon = galScanner.nextInt();
						Conversions.galConversion(fromGallon);
						break;
					case 4:
						//Liters to Gallons
						
						System.out.println("Liters to Gallons");
						Scanner litScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many liters?");
						int fromLiter = litScanner.nextInt();
						Conversions.litConversion(fromLiter);
						break;
					}	
				break;
			case 2: 
				//Distance conversions
				
				System.out.println("Distance Conversions");
				System.out.println("Select one of the following:");
				System.out.println("1. Miles to Kilometers");
				System.out.println("2. Kilometers to Miles");
				System.out.println("3. Miles to Nautical Miles");
				System.out.println("4. Nautical Miles to Miles");
				Scanner disScanner = new Scanner(System.in);
				System.out.println();
				System.out.println("Enter 1, 2, 3, or 4");
				menuSelection = disScanner.nextInt();
				
					switch(menuSelection) {
					case 1: 
						//miles to kilometers
						
						System.out.println("Miles to Kilometers");
						Scanner mileScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many miles?");
						int fromMile = mileScanner.nextInt();
						Conversions.mileConversion(fromMile);
						break;
					case 2:
						//Kilometers to miles
						
						System.out.println("Kilometers to Miles");
						Scanner kilomScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many Kilometers?");
						int fromKilom = kilomScanner.nextInt();
						Conversions.kilomConversion(fromKilom);
						break;
					case 3:
						//Miles to Nautical Miles
						
						System.out.println("Miles to Nautical Miles");
						Scanner mileNautScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many miles?");
						int fromMileNaut = mileNautScanner.nextInt();
						Conversions.mileNautConversion(fromMileNaut);
						break;
					case 4: 
						//Nautical miles to miles
						
						System.out.println("Nautical miles to Miles");
						Scanner nautScanner = new Scanner(System.in);
						System.out.println();
						System.out.println("How many Nautical Miles?");
						int fromNaut = nautScanner.nextInt();
						Conversions.nautConversion(fromNaut);
						break;
					}
					break;
			
			case 3: 
				//Terminate program
				System.out.println("Please come back again... don't forget to tip!");
				System.exit(menuSelection);
			break;
		}

		}
		
	}

}
