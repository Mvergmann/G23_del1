package Terningespil;


public class Die //Enkel (1) terning
{
    private final int MAX = 6; //Sikrer at terningen ikke kan opnå en højere værdi end 6.

    private int faceValue;

    public Die()
    {
        faceValue = 1;
    }

    public int roll() { // Terningen kan nu slå en værdi fra 1 til 6.
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    // Denne funktion gør således at man kan bestemme terningens værdi.
    public void setFaceValue(int value)
    {
        faceValue = value;
    }

    public int getFaceValue(){
        return faceValue;
    } //Henter terningens værdi efter den er slået.

    public String toString()
    {
        String result = Integer.toString(faceValue);

        return result;
    }

}
