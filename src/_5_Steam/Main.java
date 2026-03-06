package _5_Steam;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean jalan = true;
          Scanner input = new Scanner(System.in);
          ArrayList<Game> daftarGame = new ArrayList<>();
          daftarGame.add(new Game(1, "Elden Ring", 500_000));
          daftarGame.add(new Game(2, "Cyberpunk", 450_000));

        ArrayList<GameDigital> daftarGameDigital = new ArrayList<>();
        daftarGameDigital.add(new GameDigital(1, "Resident Evil 9", 850_000, 120));
        daftarGameDigital.add(new GameDigital(2, "GTA 6", 1_500_000, 200));

        User user = new User("Permana", 2_000_000);
        user.tambahSaldo(10_000);

        while (jalan){
            System.out.println("\n");
            System.out.println("Saldo awal: " + user.getSaldo());
            System.out.println("Menu: \n1. Lihat game \n2. Beli game \n3. Beli game digital \n4. Koleksi \n5. Tambah saldo \n6. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            System.out.println("\n");

            switch (pilihan){
                case 1 -> {
                    for(int i = 0; i < daftarGame.size(); i++){
                        daftarGame.get(i).tampilGame();
                    }
                    for(int i = 0; i < daftarGameDigital.size(); i++){
                        daftarGameDigital.get(i).tampilGame();
                    }
                } case 2 -> {
                    System.out.println("Masukan ID game yang ingin anda beli");
                    int id = input.nextInt();
                    user.beliGame(daftarGame, id);
                } case 3 -> {
                    System.out.println("Masukan ID game yang ingin anda beli");
                    int id = input.nextInt();
                    user.beliGameDigital(daftarGameDigital, id);
                } case 4 -> {
                    user.getKoleksi();
                } case 5 -> {
                    System.out.println("Masukan nominal yang anda inginkan: ");
                    int tmbhSaldo = input.nextInt();
                    user.tambahSaldo(tmbhSaldo);
                    System.out.println("Saldo anda sekarang adalah " + user.getSaldo());
                } case 6 -> {
                    jalan = false;
                }
                default -> System.out.println("Tolong masukan input yang valid!");
            }
        }
    }
}
