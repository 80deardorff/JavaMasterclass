public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimitTemp = (summer) ? 45 : 35;
        return ((temperature >= 25) && (temperature <= upperLimitTemp));
    }
}
