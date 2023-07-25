package Testers.StarBattleTest;

import Puzzle.StarBattle.StarBattleGrid;
import Puzzle.StarBattle.StarBattlePuzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StarBattleTest {
    private static StarBattlePuzzle starBattlePuzzle;
    private static StarBattleGrid starBattleGrid;
    private static int size;
    private static int stars;
    private static List<String> groups;

    private static void gridInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {


            System.out.println("Grid size:");
            size = Integer.parseInt(reader.readLine());

            System.out.println("Star count:");
            stars = Integer.parseInt(reader.readLine());

            String[][] tileInfo = new String[size][size];

            System.out.println("Tile info:");
            for (int i = 0; i < size; i++) {
                String[] row = reader.readLine().split(" ");
                tileInfo[i] = row;

                starBattlePuzzle = new StarBattlePuzzle(size, tileInfo, stars);
                starBattleGrid = starBattlePuzzle.getSTAR_BATTLE_GRID();

                groups = new ArrayList<>();

                for (String group : row) {
                    if (!groups.contains(group)) {
                        groups.add(group);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
