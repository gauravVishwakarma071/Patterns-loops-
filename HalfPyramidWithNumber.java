public class HalfPyramidWithNumber {
    public static void main(String args[]){

        int n = 5;

        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
