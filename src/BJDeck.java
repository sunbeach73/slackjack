// Designed by Frode Solstrand
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BJDeck {

    ArrayList<BJCard> Deck = new ArrayList<BJCard>();

    public BJDeck populateDeck() {

        JSONParser parser = new JSONParser();
        BJDeck playDeck = new BJDeck();

        try {
            Object obj = parser.parse(new FileReader("C:\\Frode\\cards.json"));

            JSONArray JaO = (JSONArray) obj;
            System.out.println(JaO);
            JSONObject jo = new JSONObject();

            BJCard cardfromFile;

            // populer kortstokken
            for (int i = 0; i < ((JSONArray) obj).size(); i++) {
                jo = (JSONObject)((JSONArray) obj).get(i);
                cardfromFile = new BJCard();
                ((BJCard) cardfromFile).BJSuit = (String) jo.get("suit");
                ((BJCard) cardfromFile).BJValue = (String) jo.get("value");;
                playDeck.Deck.add(cardfromFile);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return playDeck;
        }
}
