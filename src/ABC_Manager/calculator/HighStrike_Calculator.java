package ABC_Manager.calculator;

import ABC_Manager.Player;
import ABC_Manager.Team;

public class HighStrike_Calculator implements Calculator{
    private Player player;
    private float strike = (float) 0.0;
    private Team[] teams;

    public HighStrike_Calculator(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public void calculate() {

    }
}
