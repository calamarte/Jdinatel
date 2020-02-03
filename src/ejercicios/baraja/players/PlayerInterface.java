package ejercicios.baraja.players;

import ejercicios.baraja.Carta;

public interface PlayerInterface {

    void push(Carta... carta);
    int handSize();
    boolean handIsEmpty();
    Carta choose(Carta stackCard, Carta.Color color);
    boolean remove(Carta carta);
    Carta.Color chooseColor();
}
