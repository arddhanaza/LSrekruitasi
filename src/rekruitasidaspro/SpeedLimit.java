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

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float selisih = 0;
        System.out.println("========= Speed Limit =========");
        System.out.print("Speed  : ");
        float speed = input.nextFloat();     
        if (speed > 70) {
            selisih = speed - 70;
            int poin = 0;
            poin = (int) selisih / 5;

            if (poin <= 12) {
                System.out.println("Point   : "+poin);
            } else {
                System.out.println("license suspended");
            }
        }
        else{
            System.out.println("oke");
        }

    }
}
