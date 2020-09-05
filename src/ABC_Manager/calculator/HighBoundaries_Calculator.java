package ABC_Manager.calculator;

import ABC_Manager.Player;
import ABC_Manager.Team;

public class HighBoundaries_Calculator implements Calculator{
    private Player player;
    private int HighRuns = 0;
    private Team[] teams;

    public HighBoundaries_Calculator(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public void calculate() {

    }
}
