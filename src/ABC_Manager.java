public class ABC_Manager {
    private Team[] teams = new Team[10];
    private Serializer serializer= new Serializer();

    public ABC_Manager() {
    }

    public void manage() {
        Register register = new Register(this.teams);
        this.teams = register.register();

        serializer.serialization(teams);
        ScoreBoard scoreBoard = new ScoreBoard(this.teams);
        scoreBoard.countScore();
    }
}
