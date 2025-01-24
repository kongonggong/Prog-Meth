package logic;
import java.util.ArrayList;

public class UnitDeck {
	private String deckName ;
	private ArrayList<CardCounter> cardsInDeck ;
	
	public UnitDeck(String deckName) 
	{
		setDeckName(deckName);
		cardsInDeck = new ArrayList<>();
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		if(deckName.isBlank() ) {this.deckName =  "Untitled Deck";}
		else {this.deckName = deckName;}
	}

	
	public ArrayList<CardCounter> getCardsInDeck() {
		return cardsInDeck;
	}

	public void setCardsInDeck(ArrayList<CardCounter> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

	

	
	public  void addCard(UnitCard newCard, int count)
	{
			if(count < 1) return;
			for(CardCounter  cc : cardsInDeck)
			{
				if(newCard.getName().equals(cc.getCard().getName()))
				{
					cc.setCount( cc.getCount() + count);
					return;
				}
			}
			
			cardsInDeck.add(new CardCounter(newCard,count) );
			
	}
	
	public void removeCard(UnitCard toRemove, int count)
	{
		if(count < 1) return;
	
		for(CardCounter  tr : cardsInDeck)
		{
			if(toRemove.getName().equals(tr.getCard().getName()))
			{
				tr.setCount(tr.getCount() - count);
				
                if (tr.getCount() <= 0) {
                    cardsInDeck.remove(tr); 
                }
                
				return;
			}
		}
		
		return;
	}
	
	public int cardCount() {
        int totalCount = 0;
        for (CardCounter c : cardsInDeck) {
            totalCount += c.getCount();
        }
        return totalCount;
    }
	
	
	
	public boolean existsInDeck(UnitCard card) 
	{
		for(CardCounter  tr : cardsInDeck)
		{
			if(card.getName().equals(tr.getCard().getName()))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(UnitDeck other) 
	{
		if (this.deckName == other.deckName) {return true;}
		else {return false;}
	}
	
}