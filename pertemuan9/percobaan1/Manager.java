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
public class Manager extends Karyawan {

    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("----------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("----------------------");
    }

    public void lihatInfo() {
        System.out.println("manager: " + this.getBagian());
        System.out.println("nip: " + this.getNip());
        System.out.println("nama: " + this.getNama());
        System.out.println("golongan: " + this.getGolongan());
        System.out.println("tunjangan: " + this.getTunjangan());
        System.out.println("gaji: " + this.getGaji());
        System.out.println("bagian: " + this.getBagian());
    }
    
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }

}
