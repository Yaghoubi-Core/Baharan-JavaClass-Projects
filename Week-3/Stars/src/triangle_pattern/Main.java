package triangle_pattern;

public class Main {
    public static void main(String[] args) {
        //First -Left_right triangle

//        for (int i=1;i<=5;i++){
//            for (int b =1 ; b<=i ; b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------
        //Second -Right_right triangle

//        for (int i = 1; i <= 5; i++) {
//            for (int a = 5-i; a >=1; a--) {
//                System.out.print(" ");
//            }
//            for (int b =1;b<=i;b++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//------------------------------------------------------------------------
        //Third -Isosceles triangle


//        for (int i=1 ; i<=5 ; i++){  //1 2 3 4 5 6 7 8 9
//            for (int a =5-i;a>=1;a--){
//                System.out.print(" ");
//            }
//            for (int b=1; b<= 2*i-1; b++){
//                System.out.print("*");
//            }
//            for (int a =5-i;a>=1;a--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//------------------------------------------------------------------------
        //Forth -Right inverted triangle

//        for (int i = 5 ; i>=1 ; i--){
//            for (int b=i-1;b>=0;b--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------
        //Fifth -Left inverted triangle


//        for (int i = 1; i <= 5; i++) {      //1 2 3 4 5 i
//            for (int a = 1; a<=i-1;a++)  {  //9 7 2 3 4  b
//                System.out.print(" ");
//            }
//            for (int b =1 ; b<= (-2*i+11); b++ ){
//                System.out.print("*");
//            }
//            for (int c=1; c<= i-1; c++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }

//------------------------------------------------------------------------
        //Sixth -Center-aligned inverted triangle


//------------------------------------------------------------------------
        //Seventh -Hollow triangle


//------------------------------------------------------------------------
        //Eighth -Hollow inverted triangle


//------------------------------------------------------------------------
        //ninth -Two triangles side by side
        for (int i = 1; i <= 5; i++) {

            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }

            for (int j = 1; j <= -2 * i + 9; j++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
