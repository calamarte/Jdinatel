package ejercicios.baraja.players;

import ejercicios.baraja.CardPrinter;
import ejercicios.baraja.Carta;

import java.util.*;

public class Humano implements PlayerInterface{

    private static Scanner sc = new Scanner(System.in);

    private String name;
    private List<Carta> cartas;


    public Humano(String name){
        this.name = name;
        cartas = new ArrayList();
    }

    @Override
    public void push(Carta... carta) {
        cartas.addAll(Arrays.asList(carta));
    }

    @Override
    public int handSize() {
        return cartas.size();
    }

    @Override
    public boolean handIsEmpty() {
        return cartas.isEmpty();
    }

    @Override
    public Carta choose(Carta stackCard, Carta.Color color) {
        System.out.println("La última carta es :\n" + CardPrinter.card(stackCard) + "\n");
        System.out.println("Color de juego: " + color);
        return chooseMenu();
    }

    @Override
    public boolean remove(Carta carta) {
        return cartas.remove(carta);
    }

    @Override
    public Carta.Color chooseColor() {
        Carta.Color[] colores = Carta.Color.values();

        System.out.println("Elige un color: ");
        for (int i = 0; i < colores.length; i++) {
            System.out.println(i + "  --> " + colores[i]);
        }

        int numberChoosed;
        try {
            numberChoosed = Integer.parseInt(sc.next());
        }catch (NumberFormatException e){
            return chooseColor();
        }

        if (numberChoosed >= colores.length){
            return chooseColor();
        }

        return colores[numberChoosed];

    }

    private Carta chooseMenu(){
        StringBuilder sb = new StringBuilder();

        System.out.println("Seleccione una opción " + name +":");
        System.out.println("r  --> Robar carta");

        StringJoiner sj = new StringJoiner("      ", "  ", "");

        for (int i = 0; i < cartas.size(); i++) {
            sj.add(i > 9 ? "" : " " + String.valueOf(i));
        }

        System.out.println(CardPrinter.cards(cartas));
        System.out.println("\n" + sj.toString());

        String choose = sc.next();

        if("r".equals(choose)){
            return null;
        }

        int numberChoose;
        try {
            numberChoose = Integer.parseInt(choose);
        }catch (NumberFormatException e){
            return chooseMenu();
        }

        if(numberChoose >= cartas.size()){
            return chooseMenu();
        }

        return cartas.get(numberChoose);

    }

    @Override
    public String toString() {
        return this.name;
    }
}
