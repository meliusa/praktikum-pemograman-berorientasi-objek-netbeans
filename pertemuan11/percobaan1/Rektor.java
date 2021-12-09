/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.percobaan1;

/**
 *  
 * @author Mely
 */
public class Rektor{

    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberi sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("-------------------------------------------");
    }
    
}
