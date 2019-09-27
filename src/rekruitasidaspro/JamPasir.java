
package rekruitasidaspro;

import java.util.Scanner;
public class JamPasir {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai    : ");
        int n = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan isi      : ");
        String symbol = input.nextLine();
        
        int row = n;
        int col = ((n*2)+2);
        int awal = 2;
        int akhir = col-2;
        for (int i = 0; i < n; i++) {    
            for (int j = 0; j < col; j++) {

                if(j==0 || j ==col-1){
                    System.out.print("|");
                }
                if(j==i+1){
                    System.out.print("\\");
                }
                if(i>0 && j<i){
                    System.out.print(" ");
                }
                if(j>=awal && j<akhir){
                    System.out.print(symbol);
                }
                if(j==akhir){
                    System.out.print("/");
                }
                if(j>akhir && j<col-1){
                    System.out.print(" ");
                }
            }
            awal+=1;
            akhir-=1;
            System.out.println("");
        }
        awal=col/2;
        akhir=col/2;
        for (int i = n; i > 0; i--) {    
            for (int j = col; j > 0; j--) {
                if(j==1 || j ==col){
                    System.out.print("|");   
                }else if(i<=n && j>awal+1){
                    System.out.print(" ");
                }else if(j==awal){
                    System.out.print("/");
                }else if(j<awal && j>akhir-1){
                    System.out.print(symbol);
                }if(j==akhir){
                    System.out.print("\\");
                }else if(j<=akhir && j>0){
                    System.out.print(" ");
                }
            }
            awal+=1;
            akhir-=1;
            System.out.println("");
        }
        
        
    }
}
