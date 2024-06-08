package Application;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import FIFA_Data_Base.FIFADataBase;

import java.util.ArrayList;

public class Workspace {
    public static void main(String[] args) {
        List<FIFADataBase> playersDataBase = new ArrayList<FIFADataBase>();

        try (BufferedReader br = new BufferedReader(new FileReader("Data Base.txt"))) {
            String line = br.readLine(); // This is the first line (header) we won't use it
            line = br.readLine(); // Now we read the second line (not the header)
            while (line != null) {
                String[] vect = line.split(",");

                String playerId = vect[0];
                String playerName = vect[1];
                Byte playerOverall = Byte.parseByte(vect[2]);
                String playerClub = vect[3];

                playersDataBase.add(new FIFADataBase(playerId, playerName, playerOverall, playerClub));

                line = br.readLine();
            }

            System.out.println("PLAYERS: ");
            for (FIFADataBase x : playersDataBase) {
                System.out.println(x.toString());
            }
        } catch (IOException x) {
            System.out.println("Error: " + x.getMessage());
        }

    }
}