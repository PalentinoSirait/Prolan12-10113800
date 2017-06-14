package interfac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author valen
 */
public class rating <T> {
    T judulLagu;
    T rat;

    public T getJudulLagu() {
        return judulLagu;
    }

    public T getRat() {
        return rat;
    }

    public void setJudulLagu(T judulLagu) {
        this.judulLagu = judulLagu;
    }

    public void setRat(T rat) {
        this.rat = rat;
    }
    public String rat(char rat){
        String hasil="";
        if(rat=='B'){
            hasil ="Baik"; 
        }else if(rat=='C'){
            hasil ="Cukup";
        }else{
            hasil="Kreatif";
        }
        return hasil;
    }
}
