package ABC_Manager.calculator;

import ABC_Manager.Player;
import ABC_Manager.Team;

public class HighStrike_Calculator implements Calculator{
    private Player player;
    private String Venue;
    private float high_strike = (float) 0.0;
    private Team[] teams;

    public HighStrike_Calculator(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public String calculate() {
        for(int team_counter = 0; team_counter < 2; team_counter++){
            for(int player_counter = 0; player_counter < 2; player_counter++){
                float strike = (float) 0.0;
                for(int score_counter = 0; score_counter < 4; score_counter++){
                    if(teams[team_counter].players[player_counter].scoreCards[score_counter] != null){
                        strike = teams[team_counter].players[player_counter].scoreCards[score_counter].getStrike_rate();
                        if(strike > high_strike){
                            this.player = teams[team_counter].players[player_counter];
                            this.high_strike = strike;
                            this.Venue = teams[team_counter].players[player_counter].scoreCards[score_counter].getVenue();
                        }
                    }
                }
            }
        }
        return Float.toString(this.high_strike) + " happen - > " + this.Venue + " by " + player.getPlayer_name();
    }
}
