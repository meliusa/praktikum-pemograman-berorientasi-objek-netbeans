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
public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {

    }

    public Pc(String merk, int KecProsesor, int sizeMemory, 
            String jnsProsesor, int ukuranMonitor) {
        super(merk, KecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("ukuranMonitor:" + ukuranMonitor);
    }

}
