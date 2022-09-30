package Terningespil;

import java.util.Scanner;

public class Input
{
    public static String enter()                //Laver et scanner objekt og lader den vente på et input af typen nextLine fra keyboardet
    {
        Scanner sc = new Scanner(System.in);    //Kalder et nyt scanner object
        String s = sc.nextLine();               //Vi laver en ny string der hedder s som bliver sat til at være det samme som den næste linje brugeren skriver
        return s;                               //Den returnere string s
    }
    public static int antalslag()               //Laver en method der tæller de antal slag som brugeren vil slå
    {
        Scanner antal = new Scanner(System.in); //Laver en nyt scanner object
        int testantal = antal.nextInt();        //Laver en variabel der hedder testantal som er det samme som den næste int som brugeren skriver
        return testantal;                       //Returnere testantal
    }

}
