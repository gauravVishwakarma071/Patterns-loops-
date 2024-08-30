public class BatterflyPattern {
    public static void main(String[] args){

        int n = 5;

        //First HALF
        //outter loop
        for (int i = 1; i <=n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            int space = 2 * (n-i);    // 2* (5-1) = 8
            for (int j = 1; j <= space; j++) {    // j run <= 8
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Second HALF
        //outter loop
        for (int i = n; i >= 1; i--) {
            //inner loops
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            //space
            int space = 2 * (n-i);    // 2* (5-1) = 8
            for (int j = 1; j <= space; j++) {    // j run <= 8
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
