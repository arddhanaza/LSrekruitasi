package RekruitasiDaspro;
import java.util.Scanner;
public class PersamaanLinear {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Persamaan: ");
        String eq = key.nextLine();
        
        int a,b,c,x;
        
        if(eq.charAt(0)=='x'){
            eq= "1" + eq;
        }else if(eq.charAt(0) =='-' && eq.charAt(1) == 'x'){
            eq= eq.substring(0,1)+"1"+eq.substring(1);
        }
        
        String eqs[] = eq.split("[x.=]");
        
        int indexofX = eq.indexOf("x");
        
        if(eq.substring(indexofX+1).startsWith("=")){
            if(String.valueOf(eqs[0]).contains("+") || String.valueOf(eqs[0]).contains("-") && eqs[0].charAt(0)!='-'){
                System.out.println("Format Penulisan Salah");
                System.exit(0);
            }
            a = Integer.parseInt(eqs[0]);
            b = 0;
            c = Integer.parseInt(eqs[2]);
            
        }else{
            a = Integer.parseInt(eqs[0]);
            b = Integer.parseInt(eqs[1]);
            c = Integer.parseInt(eqs[2]);
        }
        
        x=(c-b)/a;
        if((c-b)%a != 0){
            System.out.println("a = " +a);
            System.out.println("b = " +b);
            System.out.println("c = " +c);
            if((c-b)<0 && a <0){
                c = c*-1;
                a = a*-1;
            }
            System.out.println("x = " + (c-b) + "/" + a);
        }else{
            System.out.println("a = " +a);
            System.out.println("b = " +b);
            System.out.println("c = " +c);
            System.out.println("x = " +x);
        }
        
        
       
    }
}
