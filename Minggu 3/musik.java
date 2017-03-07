class musik {
    public static void main(String[] args) {
      lagu song = new lagu();
      produser pro = new produser();
      
        System.out.print("---------Produser Musik Indonesia---------- \n");
        System.out.print("Label Prosser : ");pro.lebelLagu();
        int thnRilis= pro.tahunRilis=2017;
        System.out.print("Tahun Rilis Album : ");System.out.println(thnRilis);
        int jumlah = pro.artis=20;
        System.out.print("Jumlah Artis Yang Dimiliki : ");
        System.out.println(jumlah);
        System.out.println("--------------------------------------------");
        System.out.print("Album Yang Berhasil Rilis : ");
        song.albumRilis();
        System.out.print("JudulLagu : ");
        song.judulLagu();
    }
    
}
