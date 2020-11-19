package Detektif;
public class DetektifDewasa extends Detektif {
    private String namaIstri;
    private int jumlahAnak;
    
    public DetektifDewasa(String nama) {
        super(nama);
    }

    public void setNamaIstri(String namaIstri) {
        this.namaIstri = namaIstri;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    @Override
    public void statusUsia() {
        System.out.printf("Detektif Dewasa\n");
    }
    
    @Override
    public void tampilHasil() {
        super.tampilHasil();
        System.out.printf("Nama Istri : %s\n",namaIstri);
        System.out.printf("Jumlah Anak : %d\n",jumlahAnak);
        System.out.printf("-----\n");
    }    
    
    
}
