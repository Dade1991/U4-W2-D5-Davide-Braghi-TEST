package davidebraghi;

import davidebraghi.entities.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GameManagerSystem {
    private Map<String, Game> gameItem = new HashMap<>();

    // Aggiunta di un item (Con controllo dei dublicati)

    public void addItem(Game g) {
        if (gameItem.containsKey(g.getId())) {
            throw new IllegalArgumentException(
                    "Attention: the ID " + g.getId() + " already exist."
            );
        } else {
            gameItem.put(g.getId(), g);
        }
    }

    // Ricerca per ID

    public Game searchByID(String id) {
        for (Game g : gameItem.values()) {
            if (g.getId().equals(id)) {
                return g;
            }
        }
        throw new NoSuchElementException("ID " + id + " not found");
    }

    // Ricerca per prezzo

    public List<Game> searchByPrice(double priceCupFilter) {
        return gameItem.values()
                .stream()
                .filter(g -> g.getPrice() < priceCupFilter)
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

    // Statistiche di GameManagerSystem (totale numero Games, tot VideoGames, tot BoardGames, Game con prezzo più alto e media Games)


}
