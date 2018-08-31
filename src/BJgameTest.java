import static org.junit.jupiter.api.Assertions.*;

class BJgameTest {

    @org.junit.jupiter.api.Test
    void game() {
        BJHand testhand = new BJHand();
        BJDeck testdeck = new BJDeck();
        testdeck = testdeck.populateDeck();
        testhand.dealCards(testhand,testdeck,0);

        assertEquals(2, testhand.BJHand.size());  // Checks to see that 2 cards are dealt

    }
}