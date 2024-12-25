import java.util.*;

public class Inverted180_halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rows..?");
        int n = sc.nextInt();

        //Outer Loop -> for rows
        for(int i =1; i<=n; i++){
            //Inner Loop -> for space
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
