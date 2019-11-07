/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif.pkg10118062.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOIF10118062Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("======Aplikasi Pencetakan Nama====== ");
        Scanner userInput = new Scanner(System.in);
        printer hasil = new printer();
        System.out.print("Masukkan nama anda : ");
        hasil.setNama(userInput.nextLine()) ;
        System.out.print("Mau cetak nama berapa kali? :");
        hasil.setJmlcetak( userInput.nextInt()) ;
         
     hasil.cetak(hasil.getNama());
        hasil.cetak1(hasil.getJmlcetak(),hasil.getNama());
    }
    
}
