

class lagu extends produser implements artis{
    private String judul;
    private String album;
	
    public lagu(String Judullabel){
        super(Judullabel);// memodifikasi kontraktor kelas dari si bapak
        this.judul="Betapa Hebat";
        this.album="Bukan Cinta Biasa";
    }

    public String getJudul() {
        return judul;
    }

    public String getAlbum() {
        return album;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
  
    public void judulLagu(){
        judul="Sugar";
        System.out.println(judul);
    }

    public void albumRilis(){
        System.out.println(this.album);
    }

    @Override
    public void labelLagu() {
        super.labelLagu();
        System.out.println("Ini Label tidak ber parameter dari kelas anak di overide");
    }

    @Override
    public void lebelLagu(String lbl) {
        super.lebelLagu(lbl); 
        System.out.println("Ini Label ber parameter dari kelas anak di overide");
    }

    @Override
    public void tahunRilis() {
        super.tahunRilis();
    }

    @Override
    public void namaLengkapArtis(String nama) {
        System.out.println(nama);
    }

    @Override
    public void tanggalLahir() {
        System.out.println("14 Februari 199x");
    }

    @Override
    public void jenisKelamin() {
        System.out.println("Laki bro");
    }
    
}