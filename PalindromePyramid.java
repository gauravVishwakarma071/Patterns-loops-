public class PalindromePyramid {
    public static void main(String[] args) {
        
        int n = 5;

        //Outter loop
        for(int i = 1; i<=n ; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            //number
            for (int j = i; j >=1; j--){
                System.out.print(j+" ");
            }
            //reverse_number
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}/*
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
