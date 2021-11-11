public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (barking) {
            if ((hourOfDay >= 0) && (hourOfDay < 8) || (hourOfDay > 22) && (hourOfDay <= 24)) {
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}
