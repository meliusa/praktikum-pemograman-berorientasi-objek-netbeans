/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.percobaan3;

/**
 *
 * @author Mely
 */
import pertemuan12.percobaan1.PermanentEmployee;
import pertemuan12.percobaan1.IntershipEmployee;
import pertemuan12.percobaan1.ElectricityBill;
import pertemuan12.percobaan1.Employee;
import pertemuan12.percobaan1.Payable;

public class Tester3 {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
//        Employee e2[] = {pEmp, iEmp, eBill};
    }
}
