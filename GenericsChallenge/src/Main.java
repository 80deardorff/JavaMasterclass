import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Team<BasketballTeam>> basketballLeague = new ArrayList<>();

    public static void main(String[] args) {

        BasketballTeam knicks = new BasketballTeam("Knicks");
        basketballLeague.add(knicks);
        BasketballTeam rockets = new BasketballTeam("Rockets");
        basketballLeague.add(rockets);
        BasketballTeam pacers = new BasketballTeam("Pacers");
        basketballLeague.add(pacers);
        BasketballTeam bulls = new BasketballTeam("Bulls");
        basketballLeague.add(bulls);


        BaseballTeam cubs = new BaseballTeam("Cubs");
//      THE FOLLOWING DOESN'T WORK
//      basketballLeague.add(cubs);

        bulls.play(pacers, 110, 105);
        bulls.play(knicks, 99, 75);
        pacers.play(rockets, 95, 94);

        System.out.println(bulls.getWins());
        System.out.println(pacers.getWins());
        System.out.println(knicks.getWins());
        System.out.println(rockets.getWins());

        System.out.println("----------------------");
        // Print league
        printLeague();

        System.out.println("----------------------");
        // Sort the teams by wins
        printLeagueByWins();
    }

    public static void printLeague() {
        for (Team team : basketballLeague) {
            System.out.println(team.getName());
        }
    }

    public static void printLeagueByWins() {
        Collections.sort(basketballLeague);
        printLeague();
    }
}
