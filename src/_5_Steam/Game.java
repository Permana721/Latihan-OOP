package _5_Steam;

public class Game {
    private int idGame;
    private String namaGame;
    private int hargaGame;

    Game(){

    }

    Game(int idGame, String namaGame, int hargaGame){
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.hargaGame = hargaGame;
    }

    public int getIdGame(){
        return idGame;
    }

    public String getNamaGame(){
        return namaGame;
    }

    public int getHargaGame(){
        return hargaGame;
    }

    public void tampilGame(){
        System.out.println("ID: " + getIdGame());
        System.out.println("Nama: " + getNamaGame());
        System.out.println("Harga: " + getHargaGame());
    }
}
