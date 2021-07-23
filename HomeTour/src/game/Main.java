package game;

import java.util.Map;
import java.util.Scanner;

import fixtures.Room;

public class Main {

	public static Scanner userInput = new Scanner(System.in);

	public static RoomManager roomManager = new RoomManager();

	private static boolean running = true;

	public static void main(String[] args) {

		roomManager.init();

		Player player = new Player();

		// print instructions to play the game

		player.setCurrentRoom(roomManager.getStartingRoom());

		while (running) {
			System.out.println();
			printRoom(player);
			printShortDescription(player);
			printLongDescription(player);
			System.out.println();
			System.out.println("Items: ");
			printItem(player);
			System.out.println();
			printExits(player);

			String[] input = Input.collectInput();
			Input.parse(input, player);
		}

		if (!running) {
			System.out.println("Why are you leaving?");
		}

	}

	public static void endGame() {
		running = false;

	}

	public static void printExits(Player player) {
		Room currentRoom = player.getCurrentRoom();
		Map<String, Room> exits = currentRoom.getExits();
		for (Map.Entry<String, Room> exit : exits.entrySet()) {
			System.out.println("To the " + exit.getKey() + ": " + exit.getValue().getName());
		}
	}

	public static void printRoom(Player player) {
//		delivers the info on the current room as detailed in RoomManager.java
		System.out.println(player.getCurrentRoom().getName());
	}

	public static void printItem(Player player) {
		for(int i = 0; i < player.getCurrentRoom().getItems().size(); i++) {
			System.out.println(player.getCurrentRoom().getItems().get(i).getName());
		}
	}
	
	public static void printItemShortDescription(Player player) {
		for(int i = 0; i < player.getCurrentRoom().getItems().size(); i++) {
			System.out.println(player.getCurrentRoom().getItems().get(i).getShortDescription());
		}
	}

	public static void printItemLongDescription(Player player) {
		for(int i = 0; i < player.getCurrentRoom().getItems().size(); i++) {
			System.out.println(player.getCurrentRoom().getItems().get(i).getLongDescription());
		}
	}
	
	public static void printLongDescription(Player player) {
		System.out.println(player.getCurrentRoom().getLongDescription());
	}

	public static void printShortDescription(Player player) {
		System.out.println(player.getCurrentRoom().getShortDescription());
	}

	public static void printName(Player player) {
		System.out.println(player.getCurrentRoom().getName());
	}

}
