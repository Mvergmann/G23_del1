package Terningespil;

import java.util.Scanner;

public class Input
{
    public static String enter()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static String name()
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name;
    }


}
