import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan Nama Mahasiswa: ");
        mhs.setNama(input.nextLine());
        System.out.print("Masukkan NIM Mahasiswa: ");
        mhs.setNim(input.nextLine());

        // Input data dosen
        Dosen dosen = new Dosen();
        System.out.print("Masukkan Nama Dosen: ");
        dosen.setNamaDosen(input.nextLine());
        System.out.print("Masukkan NIP Dosen: ");
        dosen.setNip(input.nextLine());

        // Input data mata kuliah
        Matakuliah mk = new Matakuliah();
        System.out.print("Masukkan Kode Mata Kuliah: ");
        mk.setKodeMK(input.nextLine());
        System.out.print("Masukkan Nama Mata Kuliah: ");
        mk.setNamaMK(input.nextLine());
        mk.setDosen(dosen);

        // Output semua data
        System.out.println("\n=== DATA AKADEMIK ===");
        System.out.println("Nama Mahasiswa : " + mhs.getNama());
        System.out.println("NIM            : " + mhs.getNim());
        System.out.println("Mata Kuliah    : " + mk.getNamaMK() + " (" + mk.getKodeMK() + ")");
        System.out.println("Dosen Pengampu : " + mk.getDosen().getNamaDosen() + " (NIP: " + mk.getDosen().getNip() + ")");
    }
}