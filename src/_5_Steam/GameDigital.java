package _5_Steam;

public class GameDigital extends Game{
    private int sizeGB;

    GameDigital(){

    }

    GameDigital(int idGame, String namaGame, int hargaGame, int sizeGB){
        super(idGame, namaGame, hargaGame);
        this.sizeGB = sizeGB;
    }

    public int getSizeGB(){
        return sizeGB;
    }

    public void tampilGame(){
        System.out.println("ID: " + getIdGame());
        System.out.println("Nama: " + getNamaGame());
        System.out.println("Harga: " + getHargaGame());
        System.out.println("Size: " + getSizeGB());
    }
}
