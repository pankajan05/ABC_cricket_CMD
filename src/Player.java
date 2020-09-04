import java.io.Serializable;
import java.util.Arrays;

public class Player implements Serializable {
    private int player_id;
    private String player_name;
    private int age;
    private String role;

    private int playmatch = 0;
    ScoreCard[] scoreCards = new ScoreCard[4];




    public Player() {
    }

    public Player(int player_id, String player_name, int age, String role) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.age = age;
        this.role = role;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ScoreCard[] getScoreCards() {
        return scoreCards;
    }

    public void addScoreCards(ScoreCard scoreCard) {
        this.scoreCards[playmatch] = scoreCard;
        playmatch++;
    }

    public int getPlaymatch() {
        return playmatch;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player_id=" + player_id +
                ", player_name='" + player_name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", playmatch=" + playmatch +
                ", scoreCards=" + Arrays.toString(scoreCards) +
                '}';
    }
}
