class produser{
	String lebel;
	int artis;
	int tahunRilis;
        
    produser(){
        this.lebel="Republic Cinta Management";
        this.artis=40;
        this.tahunRilis=2017;
        
    }        
    
    public void lebelLagu(String lbl){
        System.out.println(this.lebel=lbl);
    }
    public void labelLagu(){
        System.out.println(this.lebel);
    }
}
