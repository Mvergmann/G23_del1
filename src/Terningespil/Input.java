package Terningespil;

import java.util.Scanner;

public class Input
{
    public static String enter() //Laver et scanner objekt og lader den vente på et input af typen nextLine fra keyboardet
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

}
