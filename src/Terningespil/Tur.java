package Terningespil;

public class Tur {
    Die die1 = new Die();
    Die die2 = new Die();
    int sum;


    public int tur() {
        die1.roll();
        die2.roll();
        sum = die1.getFaceValue() + die2.getFaceValue();


        return sum;

    }

    public int getDie1Value() {


        return die1.getFaceValue();

    }

    public int getDie2Value() {
        return die2.getFaceValue();


    }
}

