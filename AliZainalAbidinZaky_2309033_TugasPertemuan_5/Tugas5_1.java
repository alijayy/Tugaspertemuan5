package com.AliZainalAbidinZaky_2309033_TugasPertemuan_5;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class Tugas5_1 {
    static void deret(){
        int N, hasil = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        N = input.nextInt();
        
        for(int i = 1; i<=N; i++){
            hasil += i;
            if(i == 1){
                System.out.print(i);
            } else{
                System.out.print("+"+i);
            }
        }      
        System.out.println("="+hasil);
    }

    public static void main(String[] args) {
        deret();
    }
}
