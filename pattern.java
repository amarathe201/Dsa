public class pattern {

    // public static void halfinpt(int n){
    //     for (int i=1; i<=n ; i++){
            
    //         // Spaces
    //         for (int j=1; j<=n-i; j++){
    //             System.out.println(" ");
    //         }

    //         //Stars
    //         for (int j=1; j<=i ; j++){
    //             System.out.println("*");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // public static void numpt(int n ){
    //     for (int i=1; i<=n ; i++){
    //         for (int j=1; j<=n-i+1; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void floytr(int n){
    //     int counter = 1;

    //     for (int i=1; i<=n; i++){
    //         for (int j=1; j<=i; j++){
    //             System.out.print(counter);
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void rhombus(int n){

    //     for (int i=1; i<=n; i++){

    //         //spaces
    //         for (int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    // }

    // public static void holl_rhombus(int n){
    //     for(int i=1; i<=n; i++){

    //         //space-outer
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }  

    //         //hollow-rectangle -- stars
    //         for (int j=1; j<=n; j++){
    //             if (i==1 || i==n || j==1 || j==n){
    //                 System.out.print("*");
    //             }
    //             else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }


    public static void diamond(int n){

        // 1st half ( or upper part)
        for (int i=1; i<=n; i++){

            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=2*i -1; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        //2nd half ( or lower part)

        for (int i=n; i>=1; i--){

            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=2*i -1; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }


    public static void main(String[] args) {
        // halfinpt(5);
        // numpt(5);
        // floytr(6);
        // rhombus(5);
        // holl_rhombus(5);
        diamond(4);
    }
    
}
