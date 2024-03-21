package lesson_23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String HIGH_SCORE_TXT = "highscore.txt";

    public static void main(String[] args) {
        List<HighScorer> highScorers = getHighScorersFromFile(HIGH_SCORE_TXT);
        for (int i = 0; i < highScorers.size(); i++) {
            System.out.println((i + 1) + ". " + highScorers.get(i));
        }

        saveHighscorersToFile(highScorers, HIGH_SCORE_TXT);
    }

    private static void saveHighscorersToFile(List<HighScorer> highScorers, String filename) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);

            for (HighScorer highScorer : highScorers) {
                writer.println(highScorer.toFileFormat());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
    }

    private static List<HighScorer> getHighScorersFromFile(String fileName) {
        List<HighScorer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                HighScorer highScorer = parseHighScorer(line);
                list.add(highScorer);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File wasn't found. Try again.");
        } catch (IOException e) {
            System.out.println("Something went wrong while reading from the file...");
        }

        return list;
    }

    private static HighScorer parseHighScorer(String line) {
        String[] parts = line.split(" ");
        return new HighScorer(parts[0], Integer.parseInt(parts[1]));
    }
}
