package _5_Steam;

import java.util.ArrayList;

public class Store {
    ArrayList<Game> semuaGame = new ArrayList<>();

    public ArrayList<Game> tambahGame() {
        semuaGame.add(new GameFisik(1, "Elden Ring", 500_000));
        semuaGame.add(new GameFisik(2, "Cyberpunk", 650_000));
        semuaGame.add(new GameDigital(3, "Resident Evil 9", 850_000, 120));
        semuaGame.add(new GameDigital(4, "GTA 6", 1_500_000, 200));

        return semuaGame;
    }

    public int hitungTotalGame() {
        return semuaGame.size();
    }

}
