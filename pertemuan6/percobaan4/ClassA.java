/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.percobaan4;

/**
 *
 * @author Mely
 */
public class ClassA {

    ClassA() {
        System.out.println("konstruktor A dijalankan");
    }

}

class ClassB extends ClassA {

    ClassB() {
        System.out.println("konstruktor B dijalankan");
    }

}

class ClassC extends ClassB {

    ClassC() {
        System.out.println("konstruktor kelas C dijalankan");
    }

}

class Percobaan4 {

    public static void main(String[] args) {
        ClassC test = new ClassC();
    }
}
