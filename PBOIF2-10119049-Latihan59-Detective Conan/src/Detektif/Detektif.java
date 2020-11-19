package Detektif;

public class Detektif {
    protected String nama;
    protected String pekerjaan;
    protected String kemampuan;

    public Detektif(String nama) {
        this.nama = nama;
    }
   
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }   
    
    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }
    
    public void statusUsia (){
        System.out.printf("Detektif muda maupun tua\n");
    }
    
    public void tampilHasil(){
        statusUsia();
        System.out.printf("Nama : %s\n", nama);
        System.out.printf("Pekerjaan : %s\n", pekerjaan);
        System.out.printf("Kemampuan : %s\n", kemampuan);
    }

   
    
}
