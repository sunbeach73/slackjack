// Designed by Frode Solstrand
import java.util.ArrayList;

public class BJHand {

    ArrayList<BJCard> BJHand = new ArrayList<BJCard>();

    public int getBJValue(BJHand hand) {

        Integer HandValue = 0;
        Integer c = 0;

        for (int i = 0; i < hand.BJHand.size(); i++) {
            if (hand.BJHand.get(i).BJValue.matches("J") || hand.BJHand.get(i).BJValue.matches("Q") || hand.BJHand.get(i).BJValue.matches("K")) {
                c = 10;
            } else if (hand.BJHand.get(i).BJValue.matches("A")) {
                c = 11;
            } else{
                c = Integer.parseInt(hand.BJHand.get(i).BJValue.toString());
            }
            HandValue = HandValue + c;
        }
        return HandValue;
    }

    public void listHand(BJHand hand) {
        for (int i = 0; i < hand.BJHand.size(); i++) {
            System.out.print(hand.BJHand.get(i).BJSuit.charAt(0));
            System.out.print(hand.BJHand.get(i).BJValue);
            if (i+1 != hand.BJHand.size()) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public BJHand dealCards (BJHand hand, BJDeck deck, Integer indx){
        hand.BJHand.add(deck.Deck.get(indx++));
        hand.BJHand.add(deck.Deck.get(indx));
        return hand;
    }


//return BJHand;
}
