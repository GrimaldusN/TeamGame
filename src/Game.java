public class Game {
    private Team team1;
    private Team team2;
    private double result;

    public Game(Team team1, Team team2, double result) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public double getResult() {
        return result;
    }
}
