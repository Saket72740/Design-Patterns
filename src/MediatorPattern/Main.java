package MediatorPattern;

public class Main {
	
	public static void main(String[] args) {
		AuctionMediator auctionMediatorObj = new Auction();
		Colleague bidder1 = new Bidder("ABC", auctionMediatorObj);
		Colleague bidder2 = new Bidder("DEF", auctionMediatorObj);
		
		bidder1.placeBid(2000);
		bidder2.placeBid(3000);
		bidder1.placeBid(3400);
	}
}
