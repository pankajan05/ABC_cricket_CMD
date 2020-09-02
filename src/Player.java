public class Player {
    private int player_id;
    private String player_name;
    private String School_team;
    private int age;
    private String role;

    public Player() {
    }

    public Player(int player_id, String player_name, String school_team, int age, String role) {
        this.player_id = player_id;
        this.player_name = player_name;
        School_team = school_team;
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

    public String getSchool_team() {
        return School_team;
    }

    public void setSchool_team(String school_team) {
        School_team = school_team;
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

    @Override
    public String toString() {
        return "Player{" +
                "player_id=" + player_id +
                ", player_name='" + player_name + '\'' +
                ", School_team='" + School_team + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
