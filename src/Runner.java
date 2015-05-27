/**
 * Created by maheshbr on 02/04/15.
 */
public class Runner {
    public static void main(String[] args )
    {
        double inches = 12;
        Converter conv = new Converter();
        System.out.println( inches + " Inches = " + conv.convertInchesToCentimeter(inches) + " \n Centimeters"
        + "\n MM " + conv.convertInchesToMM(inches)
        + "\n Meters " + conv.convertInchesToMeter(inches)

        );

    }
}
