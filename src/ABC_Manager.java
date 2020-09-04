public class ABC_Manager {
    private Team[] teams = new Team[10];
    private Serializer serializer= new Serializer();

    public ABC_Manager() {
    }

    public void manage() {
        //Register register = new Register(this.teams);
        //this.teams = register.register();


        //serializer.serialization(teams);
        this.teams = serializer.deserialization();
        System.out.println(teams[0]);
        ScoreBoard scoreBoard = new ScoreBoard(this.teams);
        scoreBoard.countScore();



    }
}
