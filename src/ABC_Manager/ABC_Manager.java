package ABC_Manager;

import ABC_Manager.calculator.Calculator;

public class ABC_Manager {
    private Team[] teams = new Team[10];
    private Serializer serializer= new Serializer();

    public ABC_Manager() {
    }

    public void manage() {
        //Register register = new Register(this.teams);
        //this.teams = register.register();

        //ScoreBoard scoreBoard = new ScoreBoard(this.teams);
        //this.teams = scoreBoard.countScore();

        this.teams = serializer.deserialization();

        System.out.println(teams[0]);
        //serializer.serialization(teams);

        Calculator calculator;


    }
}
