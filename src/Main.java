import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new generator();

    }


    public static class generator {
        private static final int NUM_TEAMS_PER_CATEGORY = 25;

        public Set<Team> generateTeams() {
            Faker faker = new Faker();
            Set<Team> teams = new HashSet<>();

            for (Type type: Type.values()) {
                for (int i = 0; i < NUM_TEAMS_PER_CATEGORY; i++) {
                    Set<Player> players = generatePlayers(type);
                    String teamName = String.valueOf(faker.team());
                    Team team = new Team(teamName, players);
                    teams.add(team);
                }
            }

            return teams;
        }

        private Set<Player> generatePlayers(Type type) {
            Faker faker = new Faker();
            Set<Player> players = new HashSet<>();
            Random random = new Random();

            for (int i = 0; i < 3; i++) {
                String playerName = faker.name().fullName();
                int playerAge = random.nextInt(25, 45);
                String playerCategory = type.name();

                Player player = new Player(playerName, playerAge, playerCategory.getClass());
                players.add(player);
            }

            return players;
        }
    }
}