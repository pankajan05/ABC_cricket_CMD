import java.util.Scanner;

public class Register {
    private Team[] teams = new Team[10];
    private Scanner input = new Scanner(System.in);

    public Register() {
    }

    public void start() {
        for(int x = 0; x < 1; x++) {
            System.out.print("Enter team "+ (x+1) +" Team name : ");
            teams[x] = new Team(input.nextLine());
            Player[] register_players = new Player[11];

            for(int y = 0; y < 1; y++) {
                Player player = new Player();

                System.out.print("Enter player id : ");
                player.setPlayer_id(input.nextInt());

                System.out.print("Enter player name : ");
                input.nextLine(); //remove the excape character from previous input
                player.setPlayer_name(input.nextLine());

                System.out.print("Enter player age : ");
                player.setAge(input.nextInt());

                System.out.print("Enter player role : ");
                input.nextLine();//remove the excape character from previous input
                player.setRole(input.nextLine());

                register_players[y] = player;
            }

            teams[x].setPlayers(register_players);
        }

    }


    public Team[] getTeams() {
        return teams;
    }

}
