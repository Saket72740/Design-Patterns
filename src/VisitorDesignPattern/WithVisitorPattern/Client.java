package VisitorDesignPattern.WithVisitorPattern;

public class Client {

	public static void main(String[] args) {
		
		RoomElement singleRoomObj = new SingleRoom();
		RoomElement doubleRoomObj = new DoubleRoom();
		RoomElement duplexRoomObj = new DuplexRoom();
		
		RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
		singleRoomObj.accept(pricingVisitorObj);
		System.out.println(((SingleRoom)singleRoomObj).roomPrice);
		
		doubleRoomObj.accept(pricingVisitorObj);
		System.out.println(((DoubleRoom)doubleRoomObj).roomPrice);
		
		duplexRoomObj.accept(pricingVisitorObj);
		System.out.println(((DuplexRoom)duplexRoomObj).roomPrice);
		
		RoomVisitor maintenanceVisitorObj = new RoomMaintenanceVisitor();
		
		singleRoomObj.accept(maintenanceVisitorObj);
		
		doubleRoomObj.accept(maintenanceVisitorObj);
		
		duplexRoomObj.accept(maintenanceVisitorObj);
		
	}
}
