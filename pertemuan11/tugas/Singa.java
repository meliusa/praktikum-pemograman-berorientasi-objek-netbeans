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
public class Singa extends Binatang implements IKarnivora {

    private String suara, warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
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
