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

public class StaffTetap extends Staff {

    public String golongan;
    public int asuransi;

    public StaffTetap() {

    }

    public StaffTetap(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("======================Data Staff Tetap======================");
        super.tampilDataStaff();
        System.out.println("Golongan: " + golongan);
        System.out.println("Jumlah asuransi: " + asuransi);
        System.out.println("Gaji bersih: " + (gaji + lembur - potongan - asuransi));
    }

}
