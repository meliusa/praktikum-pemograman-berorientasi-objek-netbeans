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
public class Processor {

    private String merk;
    private double cache;

    public Processor() {

    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String value) {
        this.merk = value;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setCache(double value) {
        this.cache = value;
    }

    public double getCache() {
        return this.cache;
    }
    
    public void info(){
        System.out.println("Merk Processor = " + merk);
        System.out.println("Cache Memory = " + cache);
    }

}
