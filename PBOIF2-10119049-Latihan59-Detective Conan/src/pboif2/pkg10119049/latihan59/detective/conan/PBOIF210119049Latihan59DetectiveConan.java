package pboif2.pkg10119049.latihan59.detective.conan;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Memisahkan detektif kecil dan dewasa didalam character film Detective Conan
**/

import Detektif.DetektifKecil;
import Detektif.DetektifDewasa;

public class PBOIF210119049Latihan59DetectiveConan {
    public static void main(String[] args) {
        DetektifKecil k1;
        DetektifDewasa d2;
        k1 = new DetektifKecil("Shinici Kudo");
        d2 = new DetektifDewasa("Kogoro Mouri");
        
        d2.setKemampuan("Judo");
        d2.setPekerjaan("Detektif Swasta, Mantan Polisi");
        d2.setNamaIstri("Eri Kisaki");
        d2.setJumlahAnak(0);
        d2.tampilHasil();
        
        k1.setKemampuan("Expert dalam suatu kasus");
        k1.setPekerjaan("Pelajar SD Teitan, Detektif Boy");
        k1.setNamaKecil("Conan Endogawa");
        k1.tampilHasil();
    }
}
