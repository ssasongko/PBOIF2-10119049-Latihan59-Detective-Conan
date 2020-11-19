package Detektif;
public class DetektifKecil extends Detektif {
    private String namaKecil;

    public DetektifKecil(String nama) {
        super(nama);
    }

    public void setNamaKecil(String namaKecil) {
        this.namaKecil = namaKecil;
    }
    
    @Override
    public void statusUsia() {
        System.out.printf("Detektif Muda\n");
    }
    
    @Override
    public void tampilHasil() {
        super.tampilHasil();
        System.out.printf("Nama Panggilan : %s\n",namaKecil);
    }   

    
}
