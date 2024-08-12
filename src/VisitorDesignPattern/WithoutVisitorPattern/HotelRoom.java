package VisitorDesignPattern.WithoutVisitorPattern;

public class HotelRoom {

	public void getRoomPrice() {
		System.out.println("Price Computation Logic");
	}
	
	public void initiateRoomMaintenance() {
		System.out.println("Start room maintenance");
	}
	
	public void reserveRoom() {
		System.out.println("Perform operation to reserve the room");
	}
	
	// many more operation can come over the time
	
}
