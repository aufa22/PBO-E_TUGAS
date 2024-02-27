import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Codelab1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminSingkatan = scanner.nextLine();
        String jenisKelaminLengkap;
        if (jenisKelaminSingkatan.equalsIgnoreCase("P")) {
            jenisKelaminLengkap = "Perempuan";
        } else if (jenisKelaminSingkatan.equalsIgnoreCase("L")) {
            jenisKelaminLengkap = "Laki-laki";
        } else {
            System.out.println("Jenis kelamin tidak valid!");
            return;
        }

        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Menghitung umur
        LocalDate tanggalSekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, tanggalSekarang);

        // Output
        System.out.println("Nama: " +nama);
        System.out.println("Jenis kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal lahir: " + tanggalLahirString);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");
    }
}
