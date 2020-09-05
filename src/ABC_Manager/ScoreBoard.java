package ABC_Manager;

import java.util.Scanner;

public class ScoreBoard {
    private Team[] teams;
    private String venue;
    private int team1;
    private int team2;
    private int team1_runs = 0;
    private int team2_runs = 0;
    private Scanner input = new Scanner(System.in);

    public ScoreBoard(Team[] teams) {
        this.teams = teams;
    }

    public Team[] countScore() {
        this.select_venue();
        this.selectTeam();
        System.out.println("Now playing team are "+ teams[team1].getTeam_name()+" and " + teams[team2].getTeam_name());

        System.out.println("It is start to count the score of team1.\n\n");
        this.record(team1);
        this.record(team2);

        this.calculate_winner();

        return this.teams;
    }

    public void selectTeam(){
        System.out.println("please select 2 teams that play the match "+ venue +": ");
        for(int x = 0; x < 2; x++){
            System.out.println(x + " : " + teams[x].getTeam_name());
        }
        System.out.print("Enter 1st play team ");
        do {
            System.out.print("correct no ? : ");
            team1 = input.nextInt();
        }while (team1 < 0 || team1 > 9);

        System.out.print("Enter 2nd team ");

        //validate the input
        do {
            System.out.print("correct no ? : ");
            team2 = input.nextInt();
        }while (team2 < 0 || team2 > 9);

    }

    public void select_venue(){
        System.out.print("Enter the venue : ");
        venue = input.nextLine();
    }

    public void printPlayer(int teamNo) {
        for(int count = 0; count < 2; count++) {
            System.out.println(count + " : " + teams[teamNo].players[count].getPlayer_name());
        }
    }

    private void record(int teamNo) {
        int selected_player;
        System.out.println("Enter -1 when team finish playing.\n Select the player no");

        for(int count = 0; count < 2; count++){
            this.printPlayer(teamNo);
            System.out.print("Enter the selected ");

            //validate the input
            do{
                System.out.print("correct player no? : ");
                selected_player = input.nextInt();
            }while (selected_player < -1 || selected_player > 11);

            if(selected_player == -1){
                break;
            }

            for(int card_no = 0; card_no < teams[teamNo].players[count].scoreCards.length; card_no++){
                if(teams[teamNo].players[selected_player].scoreCards[card_no] == null){

                    teams[teamNo].players[selected_player].scoreCards[card_no] = new ScoreCard();
                    teams[teamNo].players[selected_player].scoreCards[card_no].setVenue(venue);
                    System.out.print("Enter the ");
                    int runs;
                    //validate the input
                    do {
                        System.out.print("correct runs : ");
                        runs = input.nextInt();
                    } while (runs < 0);

                    if(teamNo == team1){
                        team1_runs += runs;
                    }else {
                        team2_runs += runs;
                    }

                    teams[teamNo].players[selected_player].scoreCards[card_no].setRuns(runs);
                    System.out.print("Enter the ");
                    int boundaries;
                    //validate the input
                    do {
                        System.out.print("correct boundaries : ");
                        boundaries = input.nextInt();
                    } while (boundaries < 0);
                    teams[teamNo].players[selected_player].scoreCards[card_no].setBoundaries(boundaries);



                    System.out.print("Enter the ");
                    float strike;
                    //validate the input
                    do {
                        System.out.print("correct strike rate : ");
                        strike = input.nextFloat();
                    } while (strike < 0.0);
                    teams[teamNo].players[selected_player].scoreCards[card_no].setStrike_rate(strike);


                    System.out.print("Enter the incidents : ");
                    input.next(); //remove the enter
                    teams[teamNo].players[selected_player].scoreCards[card_no].setIncident(input.nextLine());

                    teams[teamNo].players[selected_player].scoreCards[card_no].setBlank(false);

                    break;
                } else {
                    continue;
                }
            }
        }
    }


    private void calculate_winner() {
        if(team1_runs > team2_runs) {
            System.out.println(teams[team1].getTeam_name() + " won the match by " + (team1_runs - team2_runs) + " runs.\n\n");
        }else if(team1_runs == team2_runs) {
            System.out.println("This match is draw.\n\n");
        }else {
                System.out.println(teams[team2].getTeam_name() + " won the match by " + (team2_runs - team1_runs) + " runs.\n\n");
        }

    }

}
