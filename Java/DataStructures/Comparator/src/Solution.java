import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Player[] players;
        Checker checker = new Checker();

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            players = new Player[n];
            for (int i = 0; i < n; i++) {
                players[i] = new Player(sc.next(), sc.nextInt());
            }
        }

        Arrays.sort(players, checker);
        for (Player player : players) {
            System.out.printf("%s %s\n", player.getName(), player.getScore());
        }
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getScore() == p2.getScore()) return p1.getName().compareTo(p2.getName());
        else return p2.getScore() - p1.getScore();
    }
}