/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.tugas.overriding;

/**
 *
 * @author Mely
 */
public class Mahasiswa extends Manusia{
    
    @Override
    void makan(){
        System.out.println("mahasiswa makan");
    }
    
    void tidur(){
        System.out.println("mahasiswa tidur");
    }
    
}
