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
public class Inheritance2 {

    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "LakiLaki", 20, 
                2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 
                10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}
