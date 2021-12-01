public abstract class Team<T> implements Comparable<Team<T>> {
    private String name;
    private int wins;
    private int losses;
    private int ties;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void play(Team opponent, int score, int opponentScore) {
        if (score == opponentScore) {
            this.ties++;
        } else if (score > opponentScore) {
            this.wins++;
        } else {
            this.losses++;
        }
        if (opponent != null) {
            play(null, opponentScore, score);
        }
    }

    @Override
    public int compareTo(Team team) {
        if (this.wins > team.wins) {
            return -1;
        } else if (this.wins < team.wins) {
            return 1;
        } else {
            return 0;
        }
    }
}
