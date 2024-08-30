import java.util.*;

public class PerfectNumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number...!");
        int n = sc.nextInt();

        //Outter loop-->
        for (int i = 1; i <=n; i++) {
            //Space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //Number
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
