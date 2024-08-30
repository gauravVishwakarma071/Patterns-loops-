public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        //Outter loop
        for (int i = 1; i <= n; i++) {  //1
            //Inner loop
            for (int j = 1; j <=n-i; j++) { //j=1 , 1<=5 
                System.out.print("  ");   //j=2 , 2<=4  
            }
            for (int j = 1; j <= n; j++) {
                if(i==1 ||i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    /*
    
             * * * * * 
      * * * * *
    * * * * *
  * * * * *
* * * * *

     */
}
