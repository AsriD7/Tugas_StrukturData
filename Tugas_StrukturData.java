package Asri;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Array 1D tipe data primitif
        int [] a = {2,7,0,6};
        System.out.println(Arrays.toString(a));
        
        //Array 1D tipe data non-primitif
        String [] b = {"Asri","Jun","Mawan","Armawan"};
        System.out.println(Arrays.toString(b));
        
        //Array 2D tipe data primitif
        int [][] c = {{19,45},{17,8}};
        for(int i = 0; i < c.length; i++){
            for(int f = 0; f < c.length; f++){
                System.out.print(c[i][f]+" ");
            }
        }
    }
}
