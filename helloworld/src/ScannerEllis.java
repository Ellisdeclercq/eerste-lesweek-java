import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEllis {
    public static void main(String[] args) {
        System.out.println("Wat is je naam?");
        Scanner userinput =new Scanner(System.in);
       String username = userinput.nextLine();

        System.out.println("Hoi " + username + ", wat is je geboortejaar?");

        Scanner useryear = new Scanner(System.in);
        int geboortejaar = useryear.nextInt();
        int huidigjaar = 2018;
        int leeftijd = huidigjaar - geboortejaar;

        System.out.println("Volgens mijn gegevens ben je dan " + leeftijd + " jaar oud nu.");






    }}
