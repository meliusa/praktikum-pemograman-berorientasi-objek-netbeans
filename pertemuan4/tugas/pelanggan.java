/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.tugas;

/**
 *
 * @author Mely
 */
public class pelanggan {

    private String nama, email;
  

    public pelanggan() {

    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void info() {
        System.out.println("nama pelanggan: " + nama);
        System.out.println("email pelanggan: " + email);
    }
}
