package _5_Steam;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean jalan = true;
        Store store = new Store();
        GameFisik daftarGameFisik = new GameFisik();
        GameDigital daftarGameDigital = new GameDigital();
        Scanner input = new Scanner(System.in);
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
                    System.out.println("--- DAFTAR GAME FISIK ---");
                    for (GameFisik gf : store.getListFisik()) {
                        gf.tampilGameFisik();
                        System.out.println("-------------------");
                    }
                    System.out.println("\n--- DAFTAR GAME DIGITAL ---");
                    for (GameDigital gd : store.getListDigital()) {
                        gd.tampilGame();
                        System.out.println("-------------------");
                    }
                } case 2 -> {
//                    System.out.println("Masukan ID game yang ingin anda beli");
//                    int id = input.nextInt();
//                    user.beliGame(daftarGameFisik, id);
                } case 3 -> {
//                    System.out.println("Masukan ID game yang ingin anda beli");
//                    int id = input.nextInt();
//                    user.beliGame(daftarGameDigital, id);
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
