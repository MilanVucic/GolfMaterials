package lesson_23;

public class HighScorer {
    private String name;
    private int score;

    public HighScorer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toFileFormat() {
        return name + " " + score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}
