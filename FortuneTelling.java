/**
 * Java Basic. Home work #6(2)
 *
 * @author Iana Ushko
 * @todo 21.9.2022
 * @date 22.9.2022
 *
 */

import java.util.Random;
import java.util.Scanner;

class FortuneTelling {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String[] s = {"You will work hard!", "A new friend is waiting for you!", "Be careful on your way!", "Surprise party today!", "Sudden trip!", "Input of money to your card!", "Get ready to fall in love!", "Big shopping waiting for you!"};
    int a = 0;
    String d;

    do {
        System.out.println(" ");
        System.out.println("Please, choose a day of week: \n Monday - M, \n Tuesday - T, \n Wednesday - W, \n Thursday - Th, \n Friday - F, \n Saturday - Sa, \n Sunday - Su, \n End \n");
        d = scanner.nextLine().toUpperCase();
        int w = random.nextInt(s.length);
        if (d.equals("M") || d.equals("T") || d.equals("W") || d.equals("TH") || d.equals("F") || d.equals("SA") || d.equals("SU")) {
           System.out.println(s[w]);
        }
        else break;
    } while (d.equalsIgnoreCase("M") || d.equalsIgnoreCase("T") || d.equalsIgnoreCase("W") ||
            d.equalsIgnoreCase("TH") || d.equalsIgnoreCase("F") || d.equalsIgnoreCase("SA") || d.equalsIgnoreCase("SU"));
   }
}