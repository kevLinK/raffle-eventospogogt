import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Rifa {
    private File contestants;
    private ArrayList<String> winners;
    public Rifa (String filename) {
        try {
            this.contestants = new File("participants.txt");
            Scanner fileContents = new Scanner(this.contestants);
            if (this.contestants.exists()) {
                this.winners = new ArrayList<String>();
                while (fileContents.hasNextLine()) {
                    this.winners.add(fileContents.nextLine());
                }
            }
            fileContents.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String drawWinner() {
        int index = (int)Math.round(Math.random() * (this.winners.size() - 1));
        String winner = this.winners.get(index);
        this.winners.remove(index);
        return winner;
    }

    public boolean hasRemainingWinners() {
        return !winners.isEmpty();
    }
}