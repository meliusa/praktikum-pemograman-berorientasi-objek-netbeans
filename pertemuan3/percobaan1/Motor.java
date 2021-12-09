/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.percobaan1;

/**
 *
 * @author Asus
 */
public class Motor {

    /*
    percobaan 1
    
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
     */
    //percobaan 2
    private int kecepatan = 0;
    private boolean kontakOn = false;

    void nyalakanMeisn() {
        kontakOn = true;
    }

    void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    void tambahKecepatan() {

        if (kecepatan < 100) {
            if (kontakOn == true) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }

    }

    void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }

}
