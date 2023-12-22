public class Coins {

    public static void main(String[] args) {  
        //program that gats a number of cents as a command line argument and prints how to represent this quantity using as many quarters as possible plus the remainder in  cents
        int a = Integer.parseInt(args[0]);
        int quarters = a / 25;
        int cent = a % 25;
        System.out.println( " Use " + quarters + " quarters and " + cent + " cents " ) ;
    }


}