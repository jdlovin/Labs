package fixtures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture {

//	item array
	private ArrayList<Item> items = new ArrayList<Item>();

//	rooms
	private Map<String, Room> exits = new HashMap<>();

	public Room(String name, String shortDescription, String longDescription) {

		super(name, shortDescription, longDescription);
	}

	public Map<String, Room> getExits() {
		return exits;
	}

	
//	sets exits
	public void setExits(String direction, Room room) {
		exits.put(direction, room);
	}

//	gets exits
	public Room getExit(String direction) {
		for (String inputDirection : exits.keySet()) {
			if (inputDirection.startsWith(direction.toLowerCase().intern())) {
				return exits.get(inputDirection);
			}
		}
		return null;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(Item item) {
		items.add(item);
	}

}
