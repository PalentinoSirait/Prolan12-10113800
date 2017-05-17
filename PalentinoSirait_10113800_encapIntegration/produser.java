class produser{
	private String lebel;
	private int artis;
	private int tahunRilis;
        
    produser(String label){
        this.lebel="Republic Cinta Management";
        this.artis=40;
        this.tahunRilis=2017;
        
    }

    public String getLebel() {
        return lebel;
    }

    public int getArtis() {
        return artis;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setLebel(String lebel) {
        this.lebel = lebel;
    }

    public void setArtis(int artis) {
        this.artis = artis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    
    public void lebelLagu(String lbl){
        System.out.println(this.lebel=lbl);
    }
    public void labelLagu(){
        System.out.println(this.lebel);
    }
    public void tahunRilis(){
        System.out.println(2016+ " Dari kelas bapak");
    }
}
