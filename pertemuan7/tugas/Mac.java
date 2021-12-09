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
public class Mac extends Leptop {

    public String security;

    public Mac() {

    }

    public Mac(String merk, int KecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBatrei, String security) {
        super(merk, KecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLeptop();
        System.out.println("security:" + security);
    }

}
