package Terningespil;

import java.util.Scanner;

public class CDIO_v1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Kalder Scanner class til brug længer nede i metoden.

        int sum1;
        int sum2;
        int point1 = 0;
        int point2 = 0;
        Tur kastsp1 = new Tur();
        Tur kastsp2 = new Tur();
        // Her sættes spiller points til 0 og tur metoden kaldes fra Tur classen denne metode kaster to tegninger og returnere summen.


        System.out.println("Skriv navnet på spiller 1: ");
        String spiller1 = sc.nextLine();
        System.out.println("Skriv navnet på spiller 2: ");
        String spiller2 = sc.nextLine();
        // Her spørger programmet om input fra spilleren i form a en string som er navn på spiller 1 og 2

        while (point1 < 40 && point2 < 40) {
            // Dette while loop bliver ved med at loope de to spillers tur indtil den ende spiller går over 40 points

            System.out.println(spiller1 + " Tryk enter for at kaste tegningerne");
            Input.enter();
            // Dette har til formål at skabe breaks i spillet for at spillet ikke bar kører fra start til slut efter spillerne indtaster navn.

            System.out.println(spiller1 + " kaster terningerne");
            kastsp1.tur();
            sum1 = kastsp1.sum;
            System.out.println("du har slået " + kastsp1.getDie1Value() + " og " + kastsp1.getDie2Value());
            point1 += sum1;
            System.out.println("du har nu: " + point1 + " point.");
            System.out.println("");
            //Her sker selve spiller turen hvor der kastes to tegninger med tur metoden og de ligges sammen med spillerens nuværne points
            // Det tome print statement bruges til at lave en blank linje mellem spiller turen og det næste output.

            if (kastsp1.getDie1Value() == 1 && kastsp1.getDie2Value() == 1) {
                System.out.println("Du har slået to, 1'ere og mister alle dine point");
                point1 = 0;
            }
            if (point1 >= 40) {
                break;
            }

            while (kastsp1.getDie1Value() == kastsp1.getDie2Value()) { //Loop der giver ekstra slag hvis du slår to ens
                System.out.println(spiller1 + " slog 2 ens! Tryk enter for at kaste igen! ");
                Input.enter();

                kastsp1.tur();
                sum1 = kastsp1.sum;
                System.out.println("du har slået " + kastsp1.getDie1Value() + " og " + kastsp1.getDie2Value());
                point1 += sum1;
                System.out.println("du har nu: " + point1 + " point.");

                if (kastsp1.getDie1Value() == 1 && kastsp1.getDie2Value() == 1) {
                    System.out.println("Du har slået to, 1'ere og mister alle dine point");
                    point1 = 0;
                }
                if (point1 >= 40) {
                    break;


                }
            }

            System.out.println(spiller2 + " Tryk enter for at kaste tegningerne");
            Input.enter();
            // Input statement for at spillet ikke forsætter uden player input.

            System.out.println(spiller2 + " kaster terningerne");
            kastsp2.tur();
            sum2 = kastsp2.sum;
            System.out.println("du har slået " + kastsp2.getDie1Value() + " og " + kastsp2.getDie2Value());
            point2 += sum2;
            System.out.println("du har nu: " + point2 + " point");
            System.out.println("");
            //Spiller2's tur forløber på samme måde some spiller1 og så starter loopet forfra med spiller1's tur hvis ingen spiller har 40 eller flere point.

            if (kastsp2.getDie1Value() == 1 && kastsp2.getDie2Value() == 1) { //Sætter point til 0 hvis du slår 2 ettere.
                System.out.println("Du har slået to, 1'ere og mister alle dine point");
                point2 = 0;
            }

            while (kastsp2.getDie1Value() == kastsp2.getDie2Value()) { //Loop der giver ekstra slag hvis du slår to ens
                System.out.println(spiller2 + " Tryk enter for at kaste tegningerne");
                Input.enter();

                kastsp2.tur();
                sum1 = kastsp2.sum;
                System.out.println("du har slået " + kastsp2.getDie1Value() + " og " + kastsp2.getDie2Value());
                point1 += sum1;
                System.out.println("du har nu: " + point2 + " point.");

                if (kastsp2.getDie1Value() == 1 && kastsp2.getDie2Value() == 1) {
                    System.out.println("Du har slået to, 1'ere og mister alle dine point");
                    point1 = 0;
                }
                if (point1 >= 40) {
                    break;
                }

            }
        }
                if (point1 >= 40) {
                    System.out.println(spiller1 + " har vundet!");
                    System.out.println("Scoren blev: " + point1 + " point til " + spiller1 + " og " + point2 + " point til " + spiller2);
                    // Dette if statemnent checker om det er spiller 1 der har 40 eller over
                    //Derefter printer den en string der siger at spilleren har vundet og printer points for begge spiller
                } else {
                    System.out.println(spiller2 + " har vundet!");
                    System.out.println("Scoren blev: " + point2 + " point til " + spiller2 + " og " + point1 + " point til " + spiller1);
                    // Hvis spiller et ikke har vundet og vi er ude af while loopet må spiller 2 per definition være vinderen.
                    //Printer sejrs besked og final pointtally.
                }


        }

    }
