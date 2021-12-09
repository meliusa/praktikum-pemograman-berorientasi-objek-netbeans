/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.tugas;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=====Komputer=====");
        Komputer k = new Komputer();
        k.merk = "asd";
        k.kecProsesor = 1;
        k.sizeMemory = 1;
        k.jnsProsesor = "asd";
        k.tampilData();

        System.out.println("");

        System.out.println("=====Leptop=====");
        Leptop l = new Leptop();
        l.merk = "asd";
        l.kecProsesor = 1;
        l.sizeMemory = 1;
        l.jnsProsesor = "asd";
        l.jnsBatrei = "asd";
        l.tampilLeptop();

        System.out.println("");

        System.out.println("=====Pc=====");
        Pc p = new Pc();
        p.merk = "asd";
        p.kecProsesor = 1;
        p.sizeMemory = 1;
        p.jnsProsesor = "asd";
        p.ukuranMonitor = 1;
        p.tampilPc();

        System.out.println("");

        System.out.println("=====Mac=====");
        Mac m = new Mac("asd", 1, 1, "asd", "asd", "asd");
        m.tampilMac();

        System.out.println("");

        System.out.println("=====Windows=====");
        Windows w = new Windows("asd", 1, 1, "asd", "asd", "asd");
        w.tampilWindows();
    }
}
