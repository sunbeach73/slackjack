public class JSONtest {

    public static void winner(BJHand Spiller, BJHand Magnus){

        if ((Magnus.getBJValue(Magnus) > Spiller.getBJValue(Spiller)) && (Magnus.getBJValue(Magnus)) < 22 || Spiller.getBJValue(Spiller) > 22) {
            System.out.println("Vinner: Magnus");
        }
        else if ((Spiller.getBJValue(Spiller) > Magnus.getBJValue(Magnus)) && (Spiller.getBJValue(Spiller)) < 22 || Magnus.getBJValue(Magnus) > 22) {
            System.out.println("Vinner: Frode");
        }
        else {
            System.out.println("Vinner: Uavgjort");
        }
    }

    public static int game(BJDeck BB, BJHand Spiller, BJHand Magnus, Integer c){

        Spiller = Spiller.dealCards(Spiller, BB, c);
        Magnus = Magnus.dealCards(Magnus, BB, c+2);
        c = c+4;

        while (17 > Spiller.getBJValue(Spiller) && Spiller.getBJValue(Spiller) < 21) {
            Spiller.BJHand.add(BB.Deck.get(c++));
        }

        while (Magnus.getBJValue(Magnus) < 22 && Magnus.getBJValue(Magnus) < Spiller.getBJValue(Spiller) && Spiller.getBJValue(Spiller)<22) {
            Magnus.BJHand.add(BB.Deck.get(c++));
        }

        // Finner ut hvem som er vinneren
        winner(Spiller, Magnus);

        // Skriv ut resultat
        System.out.print("Magnus | " + Magnus.getBJValue(Magnus) + " | "); Magnus.listHand(Magnus);
        System.out.print("Frode | " + Spiller.getBJValue(Spiller) + " | "); Spiller.listHand(Spiller);

        return c;
    }

    public static void main(String[] args) {

            BJDeck gameDeck = new BJDeck();
            gameDeck = gameDeck.populateDeck();
            BJHand Magnus = new BJHand();
            BJHand Spiller = new BJHand();

            // Kjør spillet fire ganger
            Integer gamestartDeck = 0;
            gamestartDeck = game(gameDeck,Spiller,Magnus,gamestartDeck );

            Magnus = new BJHand();
            Spiller = new BJHand();
            gamestartDeck = game(gameDeck,Spiller,Magnus,gamestartDeck);

            Magnus = new BJHand();
            Spiller = new BJHand();
            gamestartDeck = game(gameDeck,Spiller,Magnus,gamestartDeck);

            Magnus = new BJHand();
            Spiller = new BJHand();
            gamestartDeck = game(gameDeck,Spiller,Magnus,gamestartDeck);

    }


}
