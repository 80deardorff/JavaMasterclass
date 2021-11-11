public class FeetAndInchesToCentimetersChallenge {

    public static void main(String[] args) {

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // Check for parameters in range
        if (!(feet >= 0.0d) || !((inches >= 0.0d) && (inches <= 12.0d))) {
            return -1.0d;
        }

        // Return centimeters
        double centimeters = (inches * 2.54d);
        centimeters += (feet * 12.0d) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " +
                centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        // Check for parameters in range
        if (!(inches >= 0.0d)) {
            return -1.0d;
        }
        double feet = (int)(inches / 12.0d);
        double remainingInches = inches % 12.0d;
        System.out.println(inches + " inches is equal to " + feet +
                " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
