/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.tugas;

/**
 *
 * @author Mely
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    private String suara, warnaBulu;

    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Makanan: Daging + Tumbuhan");
    }

    public void displayBinatang() {
        super.displayBinatang();
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna bulu: " + this.warnaBulu);
        System.out.println("");
    }

}
