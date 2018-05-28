import java.text.DecimalFormat;

public class KoekjesWorld {
    public static void main(String[] args) {
      int aantal = 1;
        double calPerServ = 189;
      double servPerBag = 6;
      double cookiesPerBag = 12;
      double cookiesPerServ = cookiesPerBag / servPerBag;
      double calPerCookie = calPerServ / cookiesPerServ;
    DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("je hebt nu zoveel calorieën gegeten " + f.format(calPerCookie * aantal));
    }
}
