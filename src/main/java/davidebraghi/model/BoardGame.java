package davidebraghi.model;

// Creo una classe BoardGame dedicata solo ai giochi da tavolo che estende le proprie proprietà alla classe Game

import davidebraghi.entities.Game;
import davidebraghi.entities.PlayerNumber;


public class BoardGame extends Game {

    // Attributi

    private PlayerNumber playerNumber;
    private double averageTimePerGame;

    // Costruttore

    public BoardGame(String id, String title, int releaseDate, double price, PlayerNumber playerNumber, double averageTimePerGame) {
        super(id, title, releaseDate, price);
        this.playerNumber = playerNumber;
        this.averageTimePerGame = averageTimePerGame;
    }

    // Getter & Setter

    public PlayerNumber getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(PlayerNumber playerNumber) {
        this.playerNumber = playerNumber;
    }

    public double getAverageTimePerGame() {
        return averageTimePerGame;
    }

    public void setAverageTimePerGame(double averageTimePerGame) {
        this.averageTimePerGame = averageTimePerGame;
    }

    // Display

    @Override
    public String toString() {
        return "Board Game {id: " + getId() +
                ", Title: " + getTitle() +
                ", Release Date: " + getReleaseDate() +
                ", Price: " + getPrice() +
                ", Players: " + playerNumber +
                ", Game avarage duration: " + averageTimePerGame +
                '}';
    }
}
