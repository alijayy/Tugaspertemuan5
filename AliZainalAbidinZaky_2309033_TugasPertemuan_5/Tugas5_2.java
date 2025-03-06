package com.AliZainalAbidinZaky_2309033_TugasPertemuan_5;
import java.util.Scanner;
/**
 *
 * @author Ali Zaky
 */
public class Tugas5_2 {
    static int bilGanjil(int batasAwal, int batasAkhir){
        int jumlah = 0;
        for(int i = batasAwal; i <= batasAkhir; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasAkhir,batasAwal;
        
        System.out.print("Masukkan bilangan awal : ");
        batasAwal = input.nextInt();
        System.out.print("Masukkan bilangan akhir : ");
        batasAkhir = input.nextInt();
        System.out.print("Bilangan ganjil dari "+ batasAwal +" sd "+ batasAkhir + " adalah : ");
        
        int totalGanjil = bilGanjil(batasAwal, batasAkhir);
        System.out.print("\nJumlah bilangan ganjilnya adalah : "+totalGanjil);
    }
}
