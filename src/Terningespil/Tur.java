package Terningespil;

public class Tur {
    Die die1 = new Die();
    Die die2 = new Die();
    int sum;


    public int tur() {  // Funktion til at slå med 2 terninger og dertil få deres samlede sum
        die1.roll();
        die2.roll();
        sum = die1.getFaceValue() + die2.getFaceValue();


        return sum;

    }

    public int getDie1Value() { // Henter værdien af første die


        return die1.getFaceValue();

    }

    public int getDie2Value() { // Henter værdien af anden die
        return die2.getFaceValue();


    }
}

