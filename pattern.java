public class pattern {
    
// Code for Half Inverted Pattern
    public static void half_inverted_pt(int n){
        for (int i=1; i<=n ; i++){
            
            // Spaces
            for (int j=1; j<=n-i; j++){
                System.out.println(" ");
            }

            //Stars
            for (int j=1; j<=i ; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        
    }

// Code for Number Pattern
    public static void number_pt(int n ){
        for (int i=1; i<=n ; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

// Code for Floyd's trinagle 
    public static void floyd_tri(int n){
        int counter = 1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }


// Code for the Rhombus Pattern
    public static void rhombus_pt(int n){

        for (int i=1; i<=n; i++){

            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

//Code for Hollow Rhombus Pattern
    public static void holl_rhombus_pt(int n){
        for(int i=1; i<=n; i++){

            //space-outer
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }  

            //hollow-rectangle -- stars
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


//Code for Diamond Pattern
    public static void diamond_pt(int n){

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
        half_inverted_pt(5);
        number_pt(5);
        floyd_tri(6);
        rhombus_pt(5);
        holl_rhombus_pt(5);
        diamond_pt(4);
    }
    
}
