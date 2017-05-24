
import java.util.Scanner;

public class mainClass {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Proses Enkapsuslasi-----------");
        String label="Menjadi bunga (konstraktor si bapak di modifikasi)";
        lagu pro = new lagu(label);
        pro.setLebel("Ini Label baru dari enkapsulasi\n");
        pro.getArtis();
        pro.labelLagu();
        pro.lebelLagu(label);
        pro.tahunRilis();
        
        System.out.println("----Proses class interface----------");
        String nama = sc.next();
        System.out.print("Nama Lengkap: ");pro.namaLengkapArtis(nama);
        System.out.print("Tanggal Lahir: ");pro.tanggalLahir();
        System.out.print("Jenis Kelamin: ");pro.jenisKelamin();
                    
    }

}
