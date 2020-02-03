package ejercicios.baraja;

import ejercicios.baraja.players.Humano;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class UnoMain {
    public static void main(String[] args) {
        Game game = new Game(new Humano("Pablo"), new Humano("Jose"));
        game.run();

        /*Baraja b = new Baraja();

        List<Carta> catas = new ArrayList();
        for (int i = 0; i < 108; i++) {
            catas.add(b.next());
        }

        System.out.println(CardPrinter.cards(catas));*/
    }
}
