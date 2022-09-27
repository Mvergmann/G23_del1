package Terningespil;


public class Die //Enkelt terning
{
    private final int MAX = 6; //sikrer at terningen ikke kan opnå en højere værdi end 6.

    private int faceValue;

    public Die()
    {
        faceValue = 1;
    }

    public int roll() { //terninge slag af en værdi fra 1-6.
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    //funktion til at sætte terningens værdi til noget bestemt
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
