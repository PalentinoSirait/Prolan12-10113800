
package oopUas;

import java.util.Scanner;

public class bbm{
double input, hitung;
    int a;
    Scanner masuk = new Scanner(System.in);
    void masuk(){
        System.out.println("--------------PERTAMINA MANYOS--------------");
            System.out.println("Menu Bahan Bakar Minyak");
            System.out.println("1.  Premium");
            System.out.println("2.  Pertamax");
            System.out.println("3.  Pertalite");
            System.out.println("4.  Solar");
            System.out.println("5.  Biosolar");
            System.out.println("6.  Keluar");
            System.out.println("");
            System.out.print("Masukkan Nomer menu = ");
            a = masuk.nextInt();
            System.out.println("");
    }
    void premium(){
        System.out.println("--------------------------------------------");
        System.out.println("------------------PREMIUM-------------------");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Jumlah Premium = ");
        input = masuk.nextDouble();
        hitung = input*7400;
        System.out.println("Total Bayar "+input+"L Premium = "+hitung);
        System.out.println("Jarak Temupuh Motor = "+(input*8)+" KM");
        System.out.println("Jarak Temupuh Mobil = "+(input*4)+" KM");
        System.out.println("Jarak Temupuh Truck = "+(input*3)+" KM");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }
    void pertamax(){
        System.out.println("--------------------------------------------");
        System.out.println("------------------PERTAMAX------------------");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Jumlah Pertamax = ");
        input = masuk.nextDouble();
        hitung = input*9600;
        System.out.println("Total Bayar "+input+"L Pertamax = "+hitung);
        System.out.println("Jarak Temupuh Motor = "+(input*6)+" KM");
        System.out.println("Jarak Temupuh Mobil = "+(input*3)+" KM");
        System.out.println("Jarak Temupuh Truck = "+(input*2)+" KM");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }
    void pertalite(){
        System.out.println("--------------------------------------------");
        System.out.println("------------------PERTALITE-----------------");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Jumlah Pertalite = ");
        input = masuk.nextDouble();
        hitung = input*8400;
        System.out.println("Total Bayar "+input+"L Pertalite = "+hitung);
        System.out.println("Jarak Temupuh Motor = "+(input*9)+" KM");
        System.out.println("Jarak Temupuh Mobil = "+(input*5)+" KM");
        System.out.println("Jarak Temupuh Truck = "+(input*4)+" KM");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }
    void solar(){
        System.out.println("--------------------------------------------");
        System.out.println("--------------------SOLAR-------------------");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Jumlah Solar = ");
        input = masuk.nextDouble();
        hitung = input*9200;
        System.out.println("Total Bayar "+input+"L Solar = "+hitung);
        System.out.println("Jarak Temupuh Motor = "+(input*0)+" KM");
        System.out.println("Jarak Temupuh Mobil = "+(input*9)+" KM");
        System.out.println("Jarak Temupuh Truck = "+(input*7)+" KM");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }
    void biosolar(){
        System.out.println("--------------------------------------------");
        System.out.println("------------------BIOSOLAR------------------");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Jumlah Biosolar = ");
        input = masuk.nextDouble();
        hitung = input*9200;
        System.out.println("Total Bayar "+input+"L Biosolar = "+hitung);
        System.out.println("Jarak Temupuh Motor = "+(input*0)+" KM");
        System.out.println("Jarak Temupuh Mobil = "+(input*9)+" KM");
        System.out.println("Jarak Temupuh Truck = "+(input*7)+" KM");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }    
}
