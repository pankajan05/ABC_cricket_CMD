import java.io.*;

public class Serializer {
    public void serialization(Team team[]) {
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\Java\\ABC_cricket_CMD\\team.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            int x= 0;
            while( x < 13) {
                out.writeObject(team[x]);
                x++;
            }

            System.out.printf("Serialized data is saved in team.ser");
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void deserialization() {
        Team[] team = new Team[10];
        try {
            FileInputStream fileIn = new FileInputStream("D:\\Java\\ABC_cricket_CMD\\team.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            int x= 0;
            while( x < 10) {
                team[x] = (Team) in.readObject();
                x++;
            }

            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();

        }
    }
}
