
package oopUas;
public class mainClass {
    public static void main(String[] args) {
            bbm bm = new bbm();
        int a;
        do{
            bm.masuk();
            switch (bm.a){
                case 1  :
                    bm.premium();
                    break;
                case 2  :
                    bm.pertamax();
                    break;
                case 3  :
                    bm.pertalite();
                    break;
                case 4  :
                    bm.solar();
                    break;
                case 5  :
                    bm.biosolar();
                    break;
        } 
        }while(bm.a<6);
        System.out.println("----------------Terima Kasih-----------------");
    }
}
