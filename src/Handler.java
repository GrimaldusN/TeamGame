import java.util.*;

public class Handler {
    private Map<Team, Double> teamScores;
    private List<Game> games;

    public Map<Team, Double> getTeamScores() {
        return teamScores;
    }

    public void setTeamScores(Map<Team, Double> teamScores) {
        this.teamScores = teamScores;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Handler() {
        this.teamScores = new HashMap<>();
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void calculateScores() {
        for (Game game : games) {
            Team team1 = game.getTeam1();
            Team team2 = game.getTeam2();
            double points = game.getResult();

            updateScores(team1, points);
            updateScores(team2, points);
        }
    }

    private void updateScores(Team team, double points) {
        if (!teamScores.containsKey(team)) {
            teamScores.put(team, (double) 0);
        }

        double currentPoints = teamScores.get(team);
        teamScores.put(team, currentPoints + calculatePoints(points));
    }

    private int calculatePoints(double points) {
        Random random = new Random();
        int rnd = random.nextInt(0,2);


        if (rnd == 0){
            return (int) (points+=1);
        }
        if (rnd==1){
            return (int) (points+= 0.5);
        }
        else {
            return (int) (points -= 1);
        }

    }

}

