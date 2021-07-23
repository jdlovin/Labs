package game;

public class Input extends Main {
	
	public static String[] collectInput() {
//		scanner object will go here to collect the input
		
		System.out.println(":::Which way would you like to go?:::");
		String input = userInput.nextLine();
		String[] inputCommands = input.split(" ");
        return inputCommands;
	}
	
	public static void parse (String[] inputCommand, Player player) {
//		navigating through the house with the use of switch statements 
		
		String action = inputCommand[0].toLowerCase().intern();
		
		String details = "";
		
		if (inputCommand.length > 1) {
			details = inputCommand[1].toLowerCase().intern();
		}
		
		if (action == "go" | action == "move") {
			switch (action) {
			case "go":
				switch(details) {
				case "north":
					System.out.println("Going north");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "east":
					System.out.println("Going east");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "south":
					System.out.println("going south");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "west":
					System.out.println("going west");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				}
				break;
			case "move":
				switch(details) {
				case "north":
					System.out.println("Going north");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "east":
					System.out.println("Going east");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "south":
					System.out.println("going south");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				case "west":
					System.out.println("going west");
					System.out.println();
					player.setCurrentRoom(player.getCurrentRoom().getExit(details));
					break;
				}
				break;
			}
		} else if (action == "interact") {
			System.out.println();
			printItemShortDescription(player);
			printItemLongDescription(player);
		} else if (action == "quit") {
			endGame();
		} else {
			System.out.println("Didn't quite catch that");
			System.out.println();
			System.out.println("Please try again");
			System.out.println();
		}
		
	}

	public static void movePlayer(String details, Player player) {
		
	}
	
}
