package davidebraghi;

import davidebraghi.entities.Genre;
import davidebraghi.entities.Platform;
import davidebraghi.entities.PlayerNumber;
import davidebraghi.model.BoardGame;
import davidebraghi.model.VideoGame;

public class MainManager {

    public static void main(String[] args) {

        gamesWarehouse();

    }

    public static void gamesWarehouse() {
        VideoGame videoGame1 = new VideoGame("1", "Metal Gear Solid 4", 2008, 50.00, Platform.XBOX, 20, Genre.ACTION);
        VideoGame videoGame2 = new VideoGame("2", "Apex", 2026, 44.00, Platform.PC, 18, Genre.FPS);
        VideoGame videoGame3 = new VideoGame("3", "Call of Duty", 2001, 36.99, Platform.PS, 50, Genre.FPS);
        VideoGame videoGame4 = new VideoGame("4", "Pokemon - Smeraldo", 2005, 150, Platform.GAMEBOY, 1000, Genre.ADVENTURE);
        VideoGame videoGame5 = new VideoGame("5", "Elden Ring", 2022, 57.00, Platform.XBOX, 200, Genre.RPG);
        VideoGame videoGame6 = new VideoGame("6", "Super Mario Bros.", 1997, 22.00, Platform.SWITCH, 8, Genre.INDIE);
        VideoGame videoGame7 = new VideoGame("7", "Need for Speed Most Wanted", 2008, 22.00, Platform.PS, 34, Genre.RACING);
        BoardGame boardGame1 = new BoardGame("A", "Scythe", 2016, 89, PlayerNumber.FOUR, 120);
        BoardGame boardGame2 = new BoardGame("B", "Zombicide Black Plague", 2014, 100, PlayerNumber.SIX, 90);
        BoardGame boardGame3 = new BoardGame("C", "Unmatched", 2024, 33, PlayerNumber.TWO, 45);
        BoardGame boardGame4 = new BoardGame("D", "Risiko", 1990, 42, PlayerNumber.FIVE, 180);
        BoardGame boardGame5 = new BoardGame("E", "Nemesis", 2017, 120, PlayerNumber.FIVE, 120);
        BoardGame boardGame6 = new BoardGame("F", "Zombicide Invader", 2025, 110.50, PlayerNumber.THREE, 100);

        System.out.println(videoGame1);
        System.out.println(boardGame1);

        GameManagerSystem GMS = new GameManagerSystem();

        System.out.println(GMS.toString());

    }
}

