package Patterns;


/*

  * * * * * 
  * * * * 
  * * * 
  * * 
  *  

*/

public class Pattern2 {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}
