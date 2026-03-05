package _5_Steam;

public class User {
    private String namaUser;
    private int saldo;
    private Game[] koleksi = new Game[10];
    private int jumlahGame = 0;

    public User(String namaUser, int saldo){
        this.namaUser = namaUser;
        this.saldo = saldo;
    }

    public void tambahSaldo(int saldo){
        this.saldo += saldo;
    }

    public void beliGame(Game game){
        if(saldo >= game.getHargaGame()){
            saldo -= game.getHargaGame();
            koleksi[jumlahGame] = game;
            jumlahGame++;

            System.out.println("Berhasil membeli " + game.getNamaGame());
        }
        else{
            System.out.println("Saldo tidak cukup");
        }
    }
}
