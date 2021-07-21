package game;

public class RoomManager {


	public void init() {
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"The small entryway of grand ole house thats used in an example that does not mean that much to me at the moment"
				);
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
	}
}
