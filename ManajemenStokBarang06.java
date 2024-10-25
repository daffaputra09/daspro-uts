import java.util.Scanner;

public class ManajemenStokBarang06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        int jumlahStok, harga, totalNilai, permintaanBarang, stokAwal;

        while (true) {
            System.out.print("\nMasukkan Nama Barang (ketik 'selesai' untuk akhiri): ");
            namaBarang = input.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan stok barang: ");
            jumlahStok = input.nextInt();
            input.nextLine();

            stokAwal = jumlahStok;

            System.out.print("Masukkan harga barang: ");
            harga = input.nextInt();
            input.nextLine();

            totalNilai = jumlahStok * harga;

            System.out.println("Total Nilai " + namaBarang+": " + totalNilai);

            System.out.print("Masukkan jumlah permintaan " + namaBarang+ ": ");
            permintaanBarang = input.nextInt();
            input.nextLine();

            System.out.println("\n===============HASIL===============");
            if (permintaanBarang <= jumlahStok) {
                System.out.println("Jumlah stok " + namaBarang+ ": " + jumlahStok);
                System.out.println("Jumlah permintaan " + namaBarang+ ": " +  permintaanBarang);
                jumlahStok -= permintaanBarang;
                System.out.println("Permintaan barang dapat dipenuhi");
                System.out.println("Sisa stok " + namaBarang+ ": " + jumlahStok);
            } else if (permintaanBarang > jumlahStok) {
                System.out.println("Jumlah stok " + namaBarang+ ": " +jumlahStok);
                System.out.println("Jumlah permintaan " + namaBarang+ ": " + permintaanBarang);
                System.out.println("Permintaan barang tidak dapat dipenuhi");
            }

            System.out.println("\n===============INFORMASI AKHIR===============");
            System.out.println("Nama barang: " + namaBarang);
            System.out.println("Jumlah stok awal: " + stokAwal);
            System.out.println("Jumlah permintaan: " + permintaanBarang);
            System.out.println("Jumlah stok akhir: " + jumlahStok);
            System.out.println("Status: " + (permintaanBarang <= stokAwal ? "Permintaan dapat dipenuhi" : "Permintaan tidak dipenuhi"));
        }
        
    }
}