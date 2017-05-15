/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valen
 */
public class palentino extends mahasiswa{

    @Override
    protected void kuliah() {
        System.out.println("Saya Kuliah Di Unikom");
    }

    @Override
    protected void lulus() {
        System.out.println("Lulus dengan IPK 3.25");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Tidak ada yng tidak lulus di angkatan saya");
    }
    
    
}
