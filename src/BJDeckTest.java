import static org.junit.jupiter.api.Assertions.*;

class BJDeckTest {
    @org.junit.jupiter.api.Test
    void game() {
        BJDeck testdeck = new BJDeck();
        testdeck = testdeck.populateDeck();

        assertEquals(52, testdeck.Deck.size());  // Checks that deck contains 52 cards
    }

}