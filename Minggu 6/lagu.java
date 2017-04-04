class lagu extends produser{
    String judul;
    String artis;
    String album;
	
    public lagu(String Judullabel){
        super(Judullabel);// memodifikasi kontraktor kelas dari si bapak
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

    public static void main(String[] args) {
        String label="Menjadi bunga (kontaktor si bapak di modifikasi)";
        lagu pro = new lagu(label);
        pro.labelLagu();
        pro.lebelLagu(label);
        pro.tahunRilis();
        
    }
    
}