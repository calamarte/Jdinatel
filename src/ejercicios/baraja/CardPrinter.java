package ejercicios.baraja;

import java.util.List;
import java.util.StringJoiner;

public class CardPrinter {

    private static final String CARD_MODEL =
            " _____ \n" +
            "|  .  |\n" +
            "| / \\ |\n" +
            "|(lcr)|\n" +
            "| \\./ |\n" +
            "|____ |\n" +
            "1234567 ";



    public static String cardMenu(List<Carta> cartas){
        return null;
    }

    public static String cards(List<Carta> cartas){
        if(cartas == null || cartas.isEmpty()){
            return "";
        }else if(cartas.size() == 1){
            return card(cartas.get(0));
        }

        String[] formatedCards = new String[cartas.size()];

        for (int i = 0; i < cartas.size(); i++) {
            formatedCards[i] = card(cartas.get(i));
        }

        StringJoiner[] base = new StringJoiner[formatedCards[0].split("\n").length];


        String[] split;
        for (int i = 0; i < formatedCards.length; i++) {
            split = formatedCards[i].split("\n");
            for (int j = 0; j < base.length; j++) {
                if (base[j] == null) {
                    base[j] = new StringJoiner(" ", "", "");
                }

                base[j].add(split[j]);
            }
        }

        StringJoiner totalJoiner = new StringJoiner("\n", "", "");

        for (int i = 0; i < base.length; i++) {
            totalJoiner.add(base[i].toString());
        }

        return totalJoiner.toString();
    }

    public static String card(Carta carta){
        String left = " ", center = " ", right = " ", color = "       ";

        switch (carta.getType()){
            case NORMAL:{
                center = String.valueOf(carta.getValue());
                break;
            }
            case FORBIDDEN:{
                center = "X";
                break;
            }
            case CHANGE_DIRECTION:{
                left = "<";
                center =  "-";
                right = ">";
                break;
            }
            case GET_TWO:{
                left = "+";
                center = "2";
                break;
            }
            case GET_FOUR:{
                left = "+";
                center = "4";
                break;
            }
            case SELECT_COLOR:{
                left = "R";
                center = "G";
                right = "B";
                break;
            }

        }

        if(carta.getColor() != null) {
            switch (carta.getColor()) {
                case RED: {
                    color = " rojo ";
                    break;
                }
                case BLUE: {
                    color = " azul ";
                    break;
                }
                case GREEN: {
                    color = "verde ";
                    break;
                }
                case YELLOW: {
                    color = "rillo ";
                    break;
                }
            }
        }

        return format(left, center, right, color);

    }

    private static String format(String left, String center, String right, String color){
        return CARD_MODEL
                .replace("l", left)
                .replace("c", center)
                .replace("r", right)
                .replace("1234567", color);
    }

}
