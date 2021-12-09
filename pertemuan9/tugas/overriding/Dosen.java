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
public class Dosen extends Manusia{
    
    @Override
    void makan(){
        System.out.println("dosen makan");
    }
    
    void lembur(){
        System.out.println("dosen lembur");
    }
    
}
