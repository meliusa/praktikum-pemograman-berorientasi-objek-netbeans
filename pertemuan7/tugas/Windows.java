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
public class Windows extends Leptop {

    public String fitur;

    public Windows() {

    }

    public Windows(String merk, int KecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, KecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLeptop();
        System.out.println("fitur:" + fitur);
    }

}
