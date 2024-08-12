package VisitorDesignPattern.WithVisitorPattern;

public interface RoomElement {
	
	public void accept(RoomVisitor visitor);
}
