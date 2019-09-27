/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekruitasidaspro;

/**
 *
 * @author Raja Nanda Satrya
 */
import java.util.Scanner;
public class FaktorPersekutuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Faktor Persekutuan 2 Bilangan");
        System.out.print("Angka Pertama     : ");
        int a =input.nextInt();
        System.out.print("Angka Kedua       : ");
        int b =input.nextInt();
        System.out.print("Faktor dari "+a+" : ");
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("Faktor dari "+b+" : ");
        for (int i = 1; i <= b; i++) {
            if(b%i==0){
                
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("Faktor persekutuan bilangan "+a+" dan "+b+" : ");
        for (int i = 1; i <= a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
