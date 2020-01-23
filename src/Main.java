public class Main {
    public static void main(String[] args){

        //static final int MAX = 10;

        int row, column;

        for (row = 1; row <= 5; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println(); //Takes us to the next line
        }
    }
}





//        int num = 0;
//        //int line = 0;
//
//        for(int j=1; j<=5; j++) {
//            for (int i = j; i <= 10; i++) {
//                num += i;
//                System.out.print(num);
//            }
//            System.out.println();
//
//        }
//
//
//        for(int i=1; i<=10; i++){
//            System.out.print(i+" ");
//            int linecount = 0;
//
//            if(i==linecount){
//                System.out.println();
//            }
//
//
//        }
