package _5_Steam;

import java.util.ArrayList;

public class Store {
    private ArrayList<GameFisik> daftarGameFisik = new ArrayList<>();
    private ArrayList<GameDigital> daftarGameDigital = new ArrayList<>();

    public void tambahGame(){
        ArrayList<GameFisik> daftarGameFisik = new ArrayList<>();
        daftarGameFisik.add(new GameFisik(1, "Elden Ring", 500_000));
        daftarGameFisik.add(new GameFisik(2, "Cyberpunk", 450_000));

        ArrayList<GameDigital> daftarGameDigital = new ArrayList<>();
        daftarGameDigital.add(new GameDigital(1, "Resident Evil 9", 850_000, 120));
        daftarGameDigital.add(new GameDigital(2, "GTA 6", 1_500_000, 200));
    }

    public int hitungTotalGameFisik() {
        return daftarGameFisik.size();
    }

    public int hitungTotalGameDigital() {
        return daftarGameDigital.size();
    }

    public ArrayList<GameFisik> getListFisik() {
        return this.daftarGameFisik;
    }

    public ArrayList<GameDigital> getListDigital() {
        return this.daftarGameDigital;
    }

}
