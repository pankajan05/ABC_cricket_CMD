public class Register {
    private Team[] teams = new Team[10];

    public Register() {
    }

    public void register_team() {
       System.out.print("Enter team Team name : ");
    }

    public void register_player() {
        System.out.print("Enter player name : ");
    }

    public Team[] getTeams() {
        return teams;
    }
    
}
