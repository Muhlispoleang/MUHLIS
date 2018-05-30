/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramSaya;

/**
 *
 * @author Acer
 */
public class Tugasperkalian8 {
    
    public static void main(String[] args) {
        System.out.println("NAMA    :   MUHLIS");
        System.out.println("NIM     :   E1E1 17 020");
        System.out.print("Tugas Struktur Data Mengeni Perkalian Delapan (8) ");
        System.out.println("Menggunakan For, While dan Do While");
        System.out.println(" ");
        System.out.println("Dengan For => 1 * 8 ( 10 kali )");
        int hslfor=0, hslwhile=0, hsldo=0, awal1=0, awal2=0;        
        
        //Dengan for
        for (int i=1; i<11; i++)
            {
                hslfor = 1 * 8;
                System.out.println(1 + " x 8 = " + hslfor);
            }
        
        
        //dengan While 
        System.out.println(" ");
        System.out.println("dengan while => 1*8 - 10*8");
        while (awal1 < 10)
            {
                awal1 = awal1 + 1;
                hslwhile = awal1 * 8;
                System.out.println(awal1 + " * 8 = " + hslwhile);
            }
        
        //Dengan Do while
        System.out.println(" ");
        System.out.println("Dengan Do While => 1*8 - 10*8");
        do {
            awal2++;
            hsldo = awal2*8;
            System.out.println(awal2 + " * 8 = " + hsldo);
        }
        while (awal2 < 10 );
        }
    }
