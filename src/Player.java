public class Player {
    private int player_id;
    private String player_name;
    private int age;
    private String role;

    private int runs;
    private int Boundaries;
    private float Strike_rate;
    private String incident;
    


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

    @Override
    public String toString() {
        return "Player{" +
                "player_id=" + player_id +
                ", player_name='" + player_name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
