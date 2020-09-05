package ABC_Manager.calculator;

import ABC_Manager.Player;
import ABC_Manager.Team;

public class HighRun_Calculator implements Calculator {
    private Player player;
    private int HighRuns = 0;
    private Team[] teams;

    public HighRun_Calculator(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public void calculate() {
        for(int team_counter = 0; team_counter < 2; team_counter++){
            for(int player_counter = 0; player_counter < 2; player_counter++){
                int runs = 0;
                for(int score_counter = 0; score_counter < 4; score_counter++){
                    if(teams[team_counter].players[player_counter].scoreCards[score_counter] != null){
                        runs += teams[team_counter].players[player_counter].scoreCards[score_counter].getRuns();
                    }
                }
                if(runs > HighRuns){
                    this.player = teams[team_counter].players[player_counter];
                    this.HighRuns = runs;
                }
            }
        }
    }
}
