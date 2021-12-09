/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.tugas;

/**
 *
 * @author Mely
 */
public class Barrier implements Destroyable {

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (this.strength * 10) / 100;
    }

    public String getBarrierInfo() {
        String info = "";
        info += "Barrier Strength = " + this.strength;
        return info;
    }

}
