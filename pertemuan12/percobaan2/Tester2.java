/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.percobaan2;

/**
 *
 * @author Mely
 */
import pertemuan12.percobaan1.PermanentEmployee;
import pertemuan12.percobaan1.Employee;

public class Tester2 {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
