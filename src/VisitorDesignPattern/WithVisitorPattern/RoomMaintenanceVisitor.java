package VisitorDesignPattern.WithVisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom singleRoomObj) {
		System.out.println("Performing maintenance of single room");
	}

	@Override
	public void visit(DoubleRoom doubleRoomObj) {
		System.out.println("Performing maintenance of double room");
	}

	@Override
	public void visit(DuplexRoom duplexRoomObj) {
		System.out.println("Performing maintenance of duplex room");
	}

}
