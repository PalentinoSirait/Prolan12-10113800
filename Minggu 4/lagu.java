class lagu{
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
}