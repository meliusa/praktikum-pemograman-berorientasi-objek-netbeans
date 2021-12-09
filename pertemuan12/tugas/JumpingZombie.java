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
public class JumpingZombie extends Zombie {

    JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (this.level == 1) {
            this.health += (this.health * 30) / 100;
        } else if (this.level == 2) {
            this.health += (this.health * 40) / 100;
        } else if (this.level == 3) {
            this.health += (this.health * 50) / 100;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (this.health * 10) / 100;
    }

    @Override
    public String getZombieInfo() {
        String info = "";
        info += "Jumping Zombie Data = \n"
                + "Health = " + this.health + "\n"
                + "Level = " + this.level;
        return info;
    }
}
