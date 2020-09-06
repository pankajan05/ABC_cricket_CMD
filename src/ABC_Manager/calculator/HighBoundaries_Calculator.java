package ABC_Manager.calculator;

import ABC_Manager.Player;
import ABC_Manager.Team;

public class HighBoundaries_Calculator implements Calculator{
    private Player player;
    private int HighBoundaries = 0;
    private Team[] teams;

    public HighBoundaries_Calculator(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public String calculate() {
        for(int team_counter = 0; team_counter < teams.length; team_counter++){
            for(int player_counter = 0; player_counter < teams[team_counter].players.length; player_counter++){
                int boundaries = 0;
                for(int score_counter = 0; score_counter < teams[team_counter].players[player_counter].scoreCards.length; score_counter++){
                    if(teams[team_counter].players[player_counter].scoreCards[score_counter] != null){
                        boundaries += teams[team_counter].players[player_counter].scoreCards[score_counter].getBoundaries();
                    }
                }
                if(boundaries > HighBoundaries){
                    this.player = teams[team_counter].players[player_counter];
                    this.HighBoundaries = boundaries;
                }
            }
        }
        return Integer.toString(this.HighBoundaries) + " got by " + this.player.getPlayer_name();
    }
}
