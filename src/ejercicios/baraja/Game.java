package ejercicios.baraja;

import ejercicios.baraja.players.PlayerInterface;

import java.util.*;

public class Game {

    private LinkedList<Carta> inGame;
    private List<Carta> robList;
    private PlayerInterface[] players;
    private Baraja baraja;
    private boolean running = false;
    private int turno = 0;
    private boolean rightDirection = true;

    public Game(PlayerInterface... players){
        this.inGame = new LinkedList();
        this.robList = new ArrayList();
        this.players = players;
        this.baraja = new Baraja();
    }

    public void run(){
        System.out.println("Iniciando el UNO!!");

        baraja.shuffle();

        inGame.push(baraja.next());
        setUpPlayers();

        this.running = true;
        PlayerInterface player;
        Carta choosed = null;
        Carta.Type type;
        boolean isValid, rob;
        Carta.Color currentColor = inGame.peek().getColor();
        while (this.running){
            isValid = false;
            rob = false;

            player = nextPlayer();


            boolean jumpTourn = false;
            while (!isValid) {
                choosed = player.choose(inGame.peek(), currentColor);
                if(null == choosed && !rob){

                    if(!robList.isEmpty()){
                        robAll(player);
                        jumpTourn = true;
                        break;
                    }

                    player.push(baraja.next());
                    rob = true;
                    continue;
                }else if (choosed == null){
                    jumpTourn = true;
                    break;
                }

                isValid = isValidCard(choosed, currentColor);
            }

            if(jumpTourn){ continue; }


            player.remove(choosed);

            if(player.handIsEmpty()){

                win(player);
                running = false;
                break;
            }

            inGame.push(choosed);

            type = choosed.getType();
            boolean chooseColor = false;
            switch (type){
                case CHANGE_DIRECTION:{
                    rightDirection = !rightDirection;
                    break;
                }
                case FORBIDDEN:{
                    System.out.println("Se ha saltado a " + nextPlayer());
                    break;
                }
                case GET_TWO:{
                    for (int i = 0; i < 2; i++) {
                        robList.add(baraja.next());
                    }
                    break;
                }
                case GET_FOUR:{
                    for (int i = 0; i < 4; i++) {
                        robList.add(baraja.next());
                    }

                }
                case SELECT_COLOR:{
                    chooseColor = true;
                    break;
                }
            }

            if(chooseColor){
                currentColor = player.chooseColor();
            }else {
                currentColor = choosed.getColor();
            }


        }

    }

    private void win(PlayerInterface player) {
        System.out.println("El jugador " + player + " ha ganado la partida!!");
    }

    private void setUpPlayers(){

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < 7; j++) {
                players[i].push(baraja.next());
            }
        }

    }

    private void robAll(PlayerInterface player){
        for (Carta c : robList) {
            player.push(c);
        }

        System.out.println("Jugador " + player + " roba " + robList.size());

        robList.clear();
    }

    private boolean isValidCard(Carta carta, Carta.Color color){
        if(null == carta)return true;

        Carta inGameCard = inGame.peek();

        if(!robList.isEmpty() && (inGameCard.getType() == Carta.Type.GET_FOUR || inGameCard.getType() == Carta.Type.GET_TWO)){
            return carta.getType() == Carta.Type.GET_FOUR || carta.getType() == Carta.Type.GET_TWO;
        }

        if (null == color){
            color = carta.getColor();
        }

        Carta.Type tipo = carta.getType();

        switch (tipo){
            case GET_FOUR:
            case SELECT_COLOR:{
                return true;
            }
            case GET_TWO:
            case FORBIDDEN:
            case CHANGE_DIRECTION:
                return carta.getColor().equals(color)
                        || carta.getType().equals(inGameCard.getType());
            case NORMAL:{
                return carta.getColor().equals(color)
                        || carta.getValue().equals(inGameCard.getValue());
            }
        }

        return false;
    }

    private PlayerInterface whoIsNext(){
        int turno = this.turno;
        if(rightDirection) {
            turno = turno < players.length - 1 ? turno + 1 : 0;
        }else {
            turno = turno > 0 ? turno - 1 : players.length - 1;
        }

        return players[turno];

    }

    private PlayerInterface nextPlayer(){
        if(rightDirection) {
            turno = turno < players.length - 1 ? turno + 1 : 0;
        }else {
            turno = turno > 0 ? turno - 1 : players.length - 1;
        }

        return players[turno];
    }
}
