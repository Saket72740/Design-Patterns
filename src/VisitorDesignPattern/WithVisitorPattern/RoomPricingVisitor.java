package VisitorDesignPattern.WithVisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom singleRoomObj) {
		System.out.println("Pricing computation logic of single room");
		singleRoomObj.roomPrice = 1000;
	}

	@Override
	public void visit(DoubleRoom doubleRoomObj) {
		System.out.println("Pricing computation logic of double room");
		doubleRoomObj.roomPrice = 1800;
	}

	@Override
	public void visit(DuplexRoom duplexRoomObj) {
		System.out.println("Pricing computation logic of duplex room");
		duplexRoomObj.roomPrice = 3000;
	}

}
