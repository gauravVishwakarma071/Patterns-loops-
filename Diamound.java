/**
 * Diamound
 */
public class Diamound {
    public static void main(String[] args) {
        
        int n = 5;

        //Outter loop
        for(int i=1; i<=n; i++){
            //forSpace
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            int z = 2*i-1;
            for(int j=1; j<=z; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        //Outter lopps
        for (int i = n; i >= 1; i--) {
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            int z = 2*i-1;
            for (int j = 1; j <= z; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */