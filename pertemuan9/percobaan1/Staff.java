/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.percobaan1;

/**
 *
 * @author Mely
 */
public class Staff extends Karyawan {

    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return this.gajiLembur;
    }

    //overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    //overriding
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("nip: " + this.getNip());
        System.out.println("nama: " + this.getNama());
        System.out.println("golongan: " + this.getGolongan());
        System.out.println("jml lembur: " + this.getLembur());
        System.out.println("gaji lembur: " + this.getGajiLembur());
        System.out.println("gaji: " + this.getGaji());
    }

}
