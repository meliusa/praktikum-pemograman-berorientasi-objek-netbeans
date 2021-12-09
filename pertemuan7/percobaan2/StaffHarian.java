/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.percobaan2;

/**
 *
 * @author Mely
 */
import pertemuan7.percobaan1.Staff;

public class StaffHarian extends Staff {

    public int jmlJamKerja;

    public StaffHarian() {

    }

    public StaffHarian(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("======================Data Staff Harian======================");
        super.tampilDataStaff();
        System.out.println("Jumlah jam kerja: " + jmlJamKerja);
        System.out.println("Gaji bersih: " + (gaji * jmlJamKerja + 
                lembur - potongan));
    }

}
