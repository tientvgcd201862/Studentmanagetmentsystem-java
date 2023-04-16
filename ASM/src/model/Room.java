package model;


import java.io.Serializable;
import java.util.Objects;

public class Room implements Serializable{
	
	private String roomName;
	public Room(String roomName) {
		super();
		
		this.roomName = roomName;
	}
	
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	@Override
	public String toString() {
		return "Room [ roomName=" + roomName + "]";
	}

}
