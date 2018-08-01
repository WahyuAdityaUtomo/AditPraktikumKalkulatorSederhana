
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class kalkulators {
    static float total = 0, angka1 = 1, angka2 = 1; //global
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        while(angka1 != 0 & angka2 != 0) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.print("Masukan pilihan anda = ");
            int pilihan = input.nextInt();
            
                System.out.print(" Masukan Bilangan ke-1 = ");
                angka1 = input.nextFloat();
                System.out.print(" Masukan Bilangan ke-2 = ");
                angka2 = input.nextFloat();
                
                switch (pilihan){
                    case 1 :
                        System.out.println(+angka1 + "=" + angka2);
                        System.out.print("Hasilnya = ");
                        total = angka1 + angka2;
                    break;
                        
                    case 2 : 
                        System.out.println(+angka1 + "=" + angka2);
                        System.out.print("Hasilnya = ");
                        total = angka1 - angka2;
                    break;
                    
                    case 3 :
                        System.out.println(+angka1 + "=" + angka2);
                        System.out.print("Hasilnya = ");
                        total = angka1 * angka2;
                    break;
                    
                    case 4 :
                        System.out.println(+angka1 + "=" + angka2);
                        System.out.print("Hasilnya = ");
                        total = angka1 / angka2;
                    break; 
                    default:
                        System.out.println("Anda Harus Mengisi angka");
                }
                System.out.println(total);
                        
                        
                        
                    
                        
                }
                
        }
        
        
    }
    

