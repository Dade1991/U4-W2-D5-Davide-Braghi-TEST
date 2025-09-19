package davidebraghi;

import davidebraghi.entities.Game;
import davidebraghi.model.BoardGame;
import davidebraghi.model.VideoGame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GameManagerSystem {

    // Mappiamo Game con CHIAVE: ID e VALORE: Game (VideGame o BoardGame)

    private Map<String, Game> gameItem = new HashMap<>();

    // Aggiunta di un item (Con controllo dei dublicati)

    public void addItem(Game singleGame) {
        if (gameItem.containsKey(singleGame.getId())) {
            throw new IllegalArgumentException(
                    "Attention: the ID " + singleGame.getId() + " already exist."
            );
        } else {
            gameItem.put(singleGame.getId(), singleGame);
        }
    }

    // Ricerca per ID

    public Game searchByID(String id) {
        for (Game singleGame : gameItem.values()) {
            if (singleGame.getId().equals(id)) {
                return singleGame;
            }
        }
        throw new NoSuchElementException("ID " + id + " not found");

    }

    // Ricerca per prezzo

    public List<Game> searchByPrice(double priceCupFilter) {
        return gameItem.values()
                .stream()
                .filter(singleGame -> singleGame.getPrice() < priceCupFilter)
                .collect(Collectors.toList());
    }

    // Ricerca per numero di giocatori

    // Rimozione di un elemento con ID

    public Game removeGameItem(String id) {
        Game removed = gameItem.remove(id);
        if (removed == null) {
            throw new NoSuchElementException("ID " + id + " not found. Cannot be removed.");
        }
        return removed;
    }

    // Aggiornamento di un elemento con ID

    public void updateGameItem(String id, Game updated) {
        if (!gameItem.containsKey(id)) {
            throw new NoSuchElementException("ID " + id + " not found. Cannot be updated.");
        }
        gameItem.put(id, updated);
    }

    // Statistiche di GameManagerSystem (totale numero Games, tot VideoGames, tot BoardGames, Game con prezzo più alto e media Games)

    public void globalStats() {
        int totalGames = gameItem.size();
        int videoGameCounter = 0;
        int boardGameCounter = 0;
        double highestPrice = 0;
        double totalPriceAmount = 0;
        double averagePrice = 0;

        // Scorro tutti i Game dal Map e:

        for (Game singleGame : gameItem.values()) {

            // - Accumolo il totalPriceAmount

            double price = singleGame.getPrice();
            totalPriceAmount += price;

            // - Nel frattempo che il ciclo persiste, controllo il Game con il prezzo più alto

            if (price > highestPrice) {
                highestPrice = price;
            }

            // Da come ho capito, instanceof ritorna true se un oggetto è una istanza di una specifica classe o sottoclasse o interfaccia
            // Lo useremo per verificare quanti videogame e giochi da tavola abbiamo tramite due counter

            if (singleGame instanceof VideoGame) {
                videoGameCounter++;
            } else if (singleGame instanceof BoardGame) {
                boardGameCounter++;
            }
        }

        // Calcolo il prezzo medio, prevenendo lo 0 che potrebbe bloccare l'esecuzione del codice

        if (averagePrice > 0) {
            averagePrice = totalPriceAmount / totalGames;
        } else {
            averagePrice = 0;
        }

        // Display delle Stats

        System.out.println("e-STORE Global Store Stats:");
        System.out.println("Total Games: " + totalGames);
        System.out.println("Videogames: " + videoGameCounter);
        System.out.println("Board Games: " + boardGameCounter);
        System.out.println("Item with highest price: " + highestPrice);
        System.out.println("Average price: " + averagePrice);
    }
}
