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
public abstract class Binatang {

    protected String nama;
    protected int jmlKaki;
    
    Binatang(){
        
    }

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJmlKaki(int value) {
        this.jmlKaki = value;
    }

    public int getJmlKaki() {
        return this.jmlKaki;
    }

    public void displayBinatang() {
        System.out.println("nama hewan: " + this.nama);
        System.out.println("jumlah kaki: " + this.jmlKaki);
    }

}
