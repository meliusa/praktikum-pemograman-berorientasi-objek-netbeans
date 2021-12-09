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
import pertemuan11.percobaan1.ICumlaude;
import pertemuan11.percobaan1.Mahasiswa;
import pertemuan11.percobaan1.PascaSarjana;
import pertemuan11.percobaan1.Rektor;
import pertemuan11.percobaan1.Sarjana;

public class interfacemain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana maskerCumlaude = new PascaSarjana("Elok");

//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(maskerCumlaude);
       
        
    }
}
