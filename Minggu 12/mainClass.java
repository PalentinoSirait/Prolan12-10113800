


import java.util.Scanner;

public class mainClass {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Proses Enkapsuslasi-----------");
        String label="Menjadi bunga (konstraktor si bapak di modifikasi)";
        lagu pro = new lagu(label);
        rating <String>rat =new rating();
        pro.setLebel("Ini Label baru dari enkapsulasi\n");
        pro.getArtis();
        pro.labelLagu();
        pro.lebelLagu(label);
        pro.tahunRilis();
        
        System.out.println("----Proses class interface----------");
        System.out.print("Inputkan Nama artis : ");
        String nama = sc.next();
        System.out.print("Nama Lengkap: ");pro.namaLengkapArtis(nama);
        System.out.print("Tanggal Lahir: ");pro.tanggalLahir();
        System.out.print("Jenis Kelamin: ");pro.jenisKelamin();
        
        System.out.println("-------Proses class generik------------");
        System.out.print("Inputkan Nama Judul Lagu : ");
        String judul = sc.next();
        System.out.print("Berikan Ratingmu : Cukup / Baik / Kreatif : ");
        String rating=sc.next();
        rat.setJudulLagu(judul);
        rat.setRat(rating);
        System.out.print("Nama Artis : ");pro.namaLengkapArtis(nama);
        System.out.print("Judul Lagu : ");System.out.println(rat.getJudulLagu());
        System.out.print("Rating : ");System.out.println(rat.getRat());
                    
    }

}
