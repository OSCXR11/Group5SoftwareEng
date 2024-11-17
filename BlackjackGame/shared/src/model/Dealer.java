package model;

public class Dealer {
	//private Card seenCard;
	//private Card unseenCard;
	private Hand dealerHand;
	private Table table;
	private Lobby lobby; //get Lobby from server class
	private Card card;
	
	public Dealer(Lobby lobby, int minBet) {
		this.lobby  = lobby;
		this.lobby.newDealer(); //increase dealer count
		createTable(minBet);
		
	}
	
	public void createTable(int minBet) {
		//add table to the lobby
		this.lobby.getTableList().add(this.table);
		this.lobby.newTable(); //increase table count
		//set the minBet
		this.table.setMinBet(minBet);
		
	}
	
	public void dealCards() {
		//deal Cards and update player and dealer hands
		//set dealerHand for Table
		this.table.setDealerHand(this.dealerHand);
		//set showCard for Table
		this.table.setDealerShowCard(this.seenCard);

		// This will be a facade, calling getNextCard() and then sending that card to certain player.
	}

	public Card getNextCard(){
		// Using the table object, call the method which accesses the shoe, which calls for the next card. Something like this i think.
		return table.getShoe().dealNextCard();
	}
	
	public void collectMoney() {
		
	}
	
	public void beginGame() {
		
	}
	
	/*
	 * getters and setters below
	 */
	
	/*public void setSeenCard(Card seenCard) {
		this.seenCard = seenCard;
	}*/
	
	public Card getSeenCard() {
		// Call hand method to return card.
		return this.dealerHand.blahblahblahfillthisinwhenthefunctionismade;
	}
	
	/*public void setUnseenCard(Card unseenCard) {
		this.unseenCard = unseenCard;
	}*/
	
	public Card getUnseenCard() {
		// Call hand method to return card.
		return this.dealerHand.blahblahblahfillthisinwhenthefunctionismade;
	}
	
	public void setDealerHand(Hand dealerHand) {
		this.dealerHand = dealerHand;
	}
	
	public Hand getDealerHand() {
		return this.dealerHand;
	}

}