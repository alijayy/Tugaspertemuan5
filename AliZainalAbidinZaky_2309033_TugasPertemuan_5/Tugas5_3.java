package com.AliZainalAbidinZaky_2309033_TugasPertemuan_5;
import java.util.Scanner;
/**
 *
 * @author Ali Zaky
 */
public class Tugas5_3 {
    static int Faktorial(int n, int faktorial){
        System.out.print(n + "! = ");
        for(int i=n; i>= 1; i--){
            faktorial *= i;
            System.out.print(i);
            
            if(i > 1){
                System.out.print("*");
            }
        }
        return faktorial;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Faktorial!");
        System.out.print("Masukkan bilangan n : ");
        int n = input.nextInt();
        
        int faktorial = 1;
        
        int Hasil = Faktorial(n, faktorial);
        System.out.println(" = "+ Hasil);
    }
    
}
