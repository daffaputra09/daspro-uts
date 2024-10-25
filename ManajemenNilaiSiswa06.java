import java.util.Scanner;

public class ManajemenNilaiSiswa06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSiswa = 0;
        double totalNilai = 0.0;
        int jumlahDiatasRatarata = 0;
        int jumlahDibawahRatarata = 0;
        
        String nama;
        double nilai;
        
        while (true) {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk mengakhiri): ");
            nama = input.nextLine();
            
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Masukkan nilai siswa: ");
            nilai = input.nextDouble();
            input.nextLine(); 
            
            totalSiswa++;
            totalNilai += nilai;
            
            double ratarataNilai = totalNilai / totalSiswa;
            
            if (nilai > ratarataNilai) {
                jumlahDiatasRatarata++;
            } else {
                jumlahDibawahRatarata++;
            }
            
            System.out.println("Rata rata saat ini: " + ratarataNilai);
        }
        
        if (totalSiswa > 0) {
            double ratarataAkhir = totalNilai / totalSiswa;
            System.out.println("\nnRata-rata akhir kelas: " + ratarataAkhir);
            System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + jumlahDiatasRatarata);
            System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: " + jumlahDibawahRatarata);
            
            if (jumlahDiatasRatarata > totalSiswa / 2) {
                System.out.println("Jumlah siswa dengan nilai di atas rata-rata: ");
            } else {
                System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: ");
            }
        } else {
            System.out.println("Tidak ada siswa yang dimasukkan");
        }
        
    }
}
