public class lagu extends produser{
    String judul;
    String artis;
    String album;
	
    lagu(){
    this.judul=judul;
    this.artis="July and friends";
    this.album="Bukan Cinta Biasa";
    }

  
    public void judulLagu(){
        judul="Sugar";
        System.out.println(judul);
    }

    public void albumRilis(){
        System.out.println(this.album);
        System.out.println(this.artis);
    }



    public static void main(String[] args) {
      lagu pro = new lagu();
        System.out.print("---------Produser Musik Indonesia---------- \n");
        System.out.print("Label Produser : ");pro.lebelLagu("I See You");
        int thnRilis= pro.tahunRilis;
        System.out.print("Tahun Rilis Album : ");System.out.println(thnRilis);
        String jumlah = pro.artis;
        System.out.print("Jumlah Artis Yang Dimiliki : ");
        System.out.println(jumlah);
        
        System.out.println("--------------------------------------------");
        System.out.print("Album Yang Berhasil Rilis : ");
        pro.albumRilis();
        System.out.print("JudulLagu : ");
        pro.judulLagu();
    }
    
}