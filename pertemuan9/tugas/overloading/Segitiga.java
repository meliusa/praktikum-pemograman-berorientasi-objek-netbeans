/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.tugas.overloading;

/**
 *
 * @author Mely
 */
public class Segitiga {

    private int sudut;

    int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    int keliling(int sisiA, int sisiB) {
        int c = sisiA + sisiB;
        return c;
    }

}
