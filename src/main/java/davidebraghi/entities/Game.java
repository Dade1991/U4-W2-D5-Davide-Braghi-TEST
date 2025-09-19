package davidebraghi.entities;

// Creo una classe (astratta perchè fungerà solo da template) di Game.

public abstract class Game {

    // Attributi

    private final String id;
    private String title;
    private int releaseDate;
    private double price;

    // Costruttore

    public Game(String id, String title, int releaseDate, double price) {
//      if(price < 0) throw new IllegalArgumentException("Price should be a 'positive' value");
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    // Getter & Setter

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
//      if(price < 0) throw new IllegalArgumentException("Price should be a 'positive' value");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", price=" + price +
                '}';
    }
}