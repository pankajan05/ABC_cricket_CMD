public class ScoreBoard {
    private Team[] teams;

    public ScoreBoard(Team[] teams) {
        this.teams = teams;
    }

    public void selectTeam(){
        System.out.println("please select 2 teams that play the match : ");
        for(int x = 0; x < 10; x++){
            System.out.println(x + " : " + teams[x].getTeam_name());
        }
    }


    public void countScore() {
    }
}
