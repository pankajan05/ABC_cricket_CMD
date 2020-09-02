import java.util.Arrays;

public class Team {
    private String Team_name;
    Player[] players = new Player[11];

    public Team(String team_name) {
        Team_name = team_name;
    }

    public String getTeam_name() {
        return Team_name;
    }

    public void setTeam_name(String team_name) {
        Team_name = team_name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Team_name='" + Team_name + '\'' +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
