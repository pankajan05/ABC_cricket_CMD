import java.util.Arrays;
import java.util.Scanner;

public class Register {
    private Team[] teams;
    private Scanner input = new Scanner(System.in);

    public Register(Team[] teams) {
        this.teams = teams;
    }

    public Team[] register() {
        for(int team_no = 0; team_no < 10; team_no++) {
            System.out.print("Enter team "+ (team_no+1) +" Team name : ");
            teams[team_no] = new Team(input.nextLine());
            Player[] register_players = new Player[11];

            for(int player_no = 0; player_no < 11; player_no++) {
                Player player = new Player();

                System.out.print("Enter player id : ");
                player.setPlayer_id(input.nextInt());

                System.out.print("Enter player name : ");
                input.nextLine();                            //remove the escape character from previous input
                player.setPlayer_name(input.nextLine());

                System.out.print("Enter player age : ");
                player.setAge(input.nextInt());

                System.out.print("Enter player role : ");
                input.nextLine();                           //remove the escape character from previous input
                player.setRole(input.nextLine());

                register_players[player_no] = player;
            }

            teams[team_no].setPlayers(register_players);
        }

        return this.teams;

    }



    @Override
    public String toString() {
        return "Register{" +
                "teams=" + Arrays.toString(teams) +
                '}';
    }
}
