public class Bank
{
    public static void main(String[] args) {
        double kapitaal = 100000;
        double termijn = 10;
        double intrest = 1.035;
        double resultaat = kapitaal;

        /*
        System.out.println("je krijgt zoveel geld van ons na 1 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 2 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 3 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 4 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 5 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 6 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 7 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 8 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 9 jaar = " + (resultaat = resultaat * intrest));
        System.out.println("je krijgt zoveel geld van ons na 10 jaar = " + (resultaat =resultaat * intrest));
        */

         for(int teller = 1; teller <= termijn; teller++){
        System.out.println("Uw kapitaal na " + teller + " jaar: "+ (resultaat = resultaat * intrest));

         }
    }
}
