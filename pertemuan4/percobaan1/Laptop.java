/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.percobaan1;

/**
 *
 * @author Mely
 */
public class Laptop {

    private String merk;
    private Processor proc;

    public void setMerk(String value) {
        this.merk = value;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setProc(Processor value) {
        this.proc = value;
    }

    public Processor getProc() {
        return this.proc;
    }

    public Laptop() {

    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void info() {
        System.out.println("Merk laptop = " + merk);
        proc.info();
    }

}
