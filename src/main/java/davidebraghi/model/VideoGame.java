package davidebraghi.model;

import davidebraghi.entities.Game;
import davidebraghi.entities.Genre;
import davidebraghi.entities.Platform;

// Creo una classe VideoGame dedicata solo ai videogame che estende le proprie proprietà alla classe Game

public class VideoGame extends Game {

    // Attributi

    private Platform platform;
    private double gamingTime;
    private Genre genre;

    // Costruttore

    public VideoGame(String id, String title, int releaseDate, double price, Platform platform, double gamingTime, Genre genre) {
        super(id, title, releaseDate, price);
        this.platform = platform;
        this.gamingTime = gamingTime;
        this.genre = genre;
    }

    // Getter & Setter

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getGamingTime() {
        return gamingTime;
    }

    public void setGamingTime(double gamingTime) {
        this.gamingTime = gamingTime;
    }

    // Display

    @Override
    public String toString() {
        return "VideoGame {id: " + getId() +
                ", Title: " + getTitle() +
                ", Release Date: " + getReleaseDate() +
                ", Price: " + getPrice() +
                ", Platform: " + platform +
                ", Gaming Time:" + gamingTime +
                ", Genre:" + genre +
                '}';
    }
}
