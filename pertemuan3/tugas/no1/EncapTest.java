/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.tugas.no1;

/**
 *
 * @author Asus
 */
public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("name:" + encap.getName());
        System.out.println("age:" + encap.getAge());
    }
}
