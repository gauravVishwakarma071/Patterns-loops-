/*
 * Swapping two input values.
 */
import java.util.*;
public class swap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st value");
            int a = sc.nextInt();
            System.out.println("Enter 2nd value");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;

            System.out.println(a+" "+b);
        }
    }
}
