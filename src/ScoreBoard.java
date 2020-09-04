import java.util.Scanner;

public class ScoreBoard {
    private Team[] teams;
    private String venue;
    private int team1;
    private int team2;
    private Scanner input = new Scanner(System.in);

    public ScoreBoard(Team[] teams) {
        this.teams = teams;
    }

    private void selectTeam(){
        System.out.println("please select 2 teams that play the match "+ venue +": ");
        for(int x = 0; x < teams.length; x++){
            System.out.println(x + " : " + teams[x].getTeam_name());
        }
        System.out.print("Enter 1st play team no : ");
        team1 = input.nextInt();
        System.out.print("Enter 2nd team no : ");
        team2 = input.nextInt();

    }

    private void select_venue(){
        System.out.print("Enter the venue : ");
        venue = input.nextLine();
    }
    public void countScore() {
        this.select_venue();
        this.selectTeam();
        System.out.println("Now playing team are "+ teams[team1].getTeam_name()+" and " + teams[team2].getTeam_name());

        System.out.println("It is start to count the score of team1.\n\n");
        count(team1);
        count(team2);
    }

    public void printPlayer(int teamNo) {
        for(int count = 0; count < 2; count++) {
            System.out.println(count + " : " + teams[teamNo].players[count].getPlayer_name());
        }
    }

    private void count(int teamNo) {
        int selected_player;
        System.out.println("Select the player no");
        for(int count = 0; count < 2; count++){
            this.printPlayer(teamNo);
            System.out.print("Enter the selected player : ");
            selected_player = input.nextInt();

            if(selected_player == -1){
                break;
            }

            teams[teamNo].players[count].scoreCards[1].setVenue(venue);
            System.out.print("Enter ");
        }
    }
}
