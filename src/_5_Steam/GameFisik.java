package _5_Steam;

public class GameFisik extends Game{
    GameFisik(){

    }

    GameFisik(int idGame, String namaGame, int hargaGame){
        super(idGame, namaGame, hargaGame);
    }

    public void tampilGameFisik(){
        System.out.println("ID: " + getIdGame());
        System.out.println("Nama: " + getNamaGame());
        System.out.println("Harga: " + getHargaGame());
    }
}
