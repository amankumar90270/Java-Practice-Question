public class Patterns {
    public static void main(String []args){



        //************** Simple Square Counting Pattern **************//
//        int n =4;
//        for (int i =0; i<= n; i++){
//           for (int j =0; j<= n; j++){
//               System.out.print(" " + j  );
//           }
//           System.out.println(" ");
//       }



        //************** Simple Square Alphabet Pattern **************//
//          int n =4;
//       for (int i =0; i<=n; i++){
//           char ch= 'A';
//           for (int j=0; j<=n; j++){
//               System.out.print(" " + ch);
//               ch =(char) (ch+1);
//           }
//        System.out.println(" ");
//       }



        //************** Simple Square Curvy Counting Pattern **************//
//        int n=4;
//        int num =1;
//        for (int i =0; i<n; i++){
//            for( int j=0; j<n; j++){
//                System.out.print(" "+ num);
//                num++;
//            }
//        System.out.println(" ");
//        }

        int n =4;
        char ch ='A';
        for (int i =0; i<=n; i++){
            for ( int  j=0; j<=n; j++){
                System.out.print(" " + ch);
                ch = (char)(ch+1);
            }
            System.out.println(" ");
        }
    }
}
