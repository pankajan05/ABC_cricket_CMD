public class ABC_Manager {
    private Team[] teams = new Team[10];

    public ABC_Manager() {
    }

    public void manage() {
        Register register = new Register(this.teams);
        this.teams = register.register();

        ScoreBoard scoreBoard = new ScoreBoard(this.teams);
    }
}
