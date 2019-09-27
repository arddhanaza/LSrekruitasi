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

public class BestSecond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aplikasi menentukan data best second ");
        System.out.print("Total data : ");
        int jumlahdata = input.nextInt();
        int arr[] = new int[jumlahdata];
        System.out.println("");
        for (int i = 0; i < jumlahdata; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " :");
            arr[i] = input.nextInt();
        }
        int maks = 0;
        int sc = 0;
        for (int i = 0; i < jumlahdata; i++) {
            if (arr[i] > maks) {
                sc = maks;
                maks = arr[i];
            } else if (arr[i] > sc) {
                sc = arr[i];
            }
        }
        System.out.println("Best Second : " + sc);
    }
}
