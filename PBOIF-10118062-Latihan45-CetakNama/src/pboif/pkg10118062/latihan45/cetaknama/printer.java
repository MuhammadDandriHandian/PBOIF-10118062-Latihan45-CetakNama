/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif.pkg10118062.latihan45.cetaknama;

/**
 *
 * @author ASUS
 */
public class printer {
    private int jmlcetak;
    private String nama;

    public int getJmlcetak() {
        return jmlcetak;
    }

    public void setJmlcetak(int jmlcetak) {
        this.jmlcetak = jmlcetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
       this.nama = nama;
    }
     
   public  void cetak(String nama) {
         System.out.println("Nama anda :"+nama); 

}

     

    void cetak1(int Jmlcetak, String nama) {
       System.out.println("Hasil cetak");
        for(int i=1; i<=Jmlcetak; i++){
            System.out.println(i+"."+nama);  
    }
    }
}
