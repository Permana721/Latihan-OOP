package _5_Steam;

import java.util.ArrayList;

public class User {
    private String namaUser;
    private int saldo;
    ArrayList<Game> koleksi = new ArrayList<>();
    private int idGame;
    private boolean ditemukan = false;

    public User() {
    }

    public User(String namaUser, int saldo){
        this.namaUser = namaUser;
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void tambahSaldo(int saldo){
        this.saldo += saldo;
    }

    public void getKoleksi(){
        if (koleksi.size() == 0) {
            System.out.println("Koleksi kamu masih kosong. Ayo beli game dulu!");
            return;
        }

        System.out.println("=== Koleksi Game Kamu ===");
        for(int i = 0; i < koleksi.size(); i++){
            koleksi.get(i).tampilGame();
        }
    }

    public void beliGame(ArrayList<? extends Game> list, int id){
        for (Game games : list) {
            if (games.getIdGame() == id) {
                ditemukan = true;
                if (saldo >= games.getHargaGame()) {
                    saldo -= games.getHargaGame();
                    koleksi.add(games);
                    System.out.println("Berhasil membeli Game: " + games.getNamaGame() + "\nDengan harga: " + games.getHargaGame() + "\nSisa saldo: " + getSaldo());
                } else {
                    System.out.println("Maaf, saldo Anda tidak cukup. Kurang: Rp" + (games.getHargaGame() - getSaldo()));
                }
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID Game tidak terdaftar di toko kami.");
        }
    }
}
