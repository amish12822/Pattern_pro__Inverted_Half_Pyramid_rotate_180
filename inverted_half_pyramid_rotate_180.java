/**
 * inverted_half_pyramid_rotate_180
 */
public class inverted_half_pyramid_rotate_180 {

    public static void main(String[] args) {
        
        int a = 4; // row also column 

        for ( int i=1; i<=a; i++){

           for ( int j=1; j<=a-i; j++){

            System.out.print(" ");
           }

           for (int j=1; j<=i; j++){
            System.out.print("*");
           }

            System.out.println();
        }
    }
    
}