package ABC_Manager;

import ABC_Manager.calculator.Calculator;
import ABC_Manager.calculator.HighBoundaries_Calculator;
import ABC_Manager.calculator.HighRun_Calculator;
import ABC_Manager.calculator.HighStrike_Calculator;

public class ABC_Manager {
    private Team[] teams = new Team[10];
    private Serializer serializer= new Serializer();

    private Calculator calculator;

    public ABC_Manager() {
    }

    public void manage() {
        //Register register = new Register(this.teams);
        //this.teams = register.register();
        //serializer.serialization(teams);

        this.teams = serializer.deserialization();
        ScoreBoard scoreBoard = new ScoreBoard(this.teams);
        this.teams = scoreBoard.countScore();



        serializer.serialization(teams);

        this.teams = this.serializer.deserialization();
        this.calculator = new HighRun_Calculator(this.teams);
        System.out.println(this.calculator.calculate());

        this.calculator = new HighBoundaries_Calculator(this.teams);
        System.out.println(this.calculator.calculate());

        this.calculator = new HighStrike_Calculator(this.teams);
        System.out.println(this.calculator.calculate());


    }
}
