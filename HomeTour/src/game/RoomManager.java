package game;

import fixtures.Room;
import fixtures.Item;
import java.util.ArrayList;

public class RoomManager {

	private Room startingRoom;

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {
		Item toiletPaper = new Item("Toilet Paper", "Chermin Ultra", "This is about empty and needs a new roll");
		
		Item mirror = new Item("A small mirror", "Small mirror with some residue on it", "This mirrow could be some evidence for the person you are after");

		Item stackedCash = new Item("A pile of cash", "A pile of cash stacked in orderly fashioned", "This could be used to pay off your mortgage . . or use as evidence");
		
		Room foyer = new Room("The Foyer", "a small foyer",
				"The small entryway of the house, not much here besides shoes and a few coats hung-up");
		rooms.add(foyer);

		Room courtYard = new Room("The Courtyard", "A small courtyard",
				"This fenced in courtyard leads to a house that belongs to a Most Wanted person");
		rooms.add(courtYard);

		Room bathRoom = new Room("The Bathroom", "Just your average bathroom",
				"There is a sink with a toilet and mirror over the sink, there is no shower present");
		rooms.add(bathRoom);
		bathRoom.setItems(toiletPaper);

		Room livingRoom = new Room("The Living Room", "A living room with 2 couches",
				"There are 2 couches along with a coffee table, the 2 couches form an 'L' shape with the coffee table in between them. There is a small mirror on the coffee table");
		rooms.add(livingRoom);
		livingRoom.setItems(mirror);
		
		Room diningRoom = new Room("The Dining Room", "A dining room with a table and chairs",
				"The dining room looks a bit messy, there are things scattered on the table with some various items, chairs are in various positions");
		rooms.add(diningRoom);

		Room kitchen = new Room("The Kitchen", "A kitchen with an island and various applicances",
				"The area looks like someone was doing things in here besides cooking, there are various items on the island");
		rooms.add(kitchen);

		Room garage = new Room("The Garage", "A garage with 2 cars inside",
				"Two cars are inside and the garage door is closed, there is a door ajar on one of the cars");
		rooms.add(garage);

		Room bedRoom = new Room("The Bedroom", "A room with a bed, dresser and a couple night stands",
				"This room, like the rest of the house, is messy, there are some items stacked in the corner");
		rooms.add(bedRoom);
		bedRoom.setItems(stackedCash);

		Room closet = new Room("The closet", "A very tight closet",
				"You can't really see anything besides clothes hanging");
		rooms.add(closet);

		Room masterBathRoom = new Room("The Master Bathroom", "This bathroom is quite cool",
				"There are 2 sinks with a mirror going along the wall on the back side of the sinks, a bathtub and walk-in shower are present as well");
		rooms.add(masterBathRoom);

		courtYard.setExits("south", foyer);
		
		foyer.setExits("north", courtYard);
		foyer.setExits("east", livingRoom);
		foyer.setExits("south", kitchen);
		foyer.setExits("west", bathRoom);
		
		bathRoom.setExits("east", foyer);
		
		garage.setExits("east", kitchen);
		
		kitchen.setExits("west", garage);
		kitchen.setExits("north", foyer);
		kitchen.setExits("east", diningRoom);
		
		diningRoom.setExits("south", bedRoom);
		diningRoom.setExits("north", livingRoom);
		diningRoom.setExits("west", kitchen);
		
		livingRoom.setExits("west", foyer);
		livingRoom.setExits("south", diningRoom);
		
		bedRoom.setExits("north", diningRoom);
		bedRoom.setExits("east", closet);
		bedRoom.setExits("south", masterBathRoom);
		
		closet.setExits("west", bedRoom);
		
		masterBathRoom.setExits("north", bedRoom);
		
		setStartingRoom(courtYard);
	}

}
