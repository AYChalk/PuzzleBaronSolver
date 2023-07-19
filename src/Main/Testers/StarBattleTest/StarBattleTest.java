package Testers.StarBattleTest;

import Puzzle.StarBattle.StarBattleGrid;
import Puzzle.StarBattle.StarBattlePlayTile;
import Puzzle.StarBattle.StarBattlePuzzle;
import Puzzle.Tile;
import Puzzle.TileState;
import PuzzleSolver.StarBattleSolver.StarBattleLogic;
import PuzzleSolver.StarBattleSolver.StarBattleSolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class StarBattleTest {

    static StarBattlePuzzle starBattlePuzzle;

    public static void test() {
        starBattleCreator();
        StarBattleSolver.setStarBattlePuzzle(starBattlePuzzle);
        StarBattleSolver.solve();
        printGrid();
    }

    public static void starBattleCreator() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int size = Integer.parseInt(reader.readLine());
            int stars = Integer.parseInt(reader.readLine());
            String[][] info = new String[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    info[i][j] = reader.readLine();
                }
            }

            starBattlePuzzle = new StarBattlePuzzle(size, info, stars);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printGrid() {
        StarBattleGrid starBattleGrid = starBattlePuzzle.getSTAR_BATTLE_GRID();
        List<List<? extends Tile>> grid = starBattleGrid.getGRID();

        for (List<? extends Tile> tileList : grid) {
            for (Tile tile : tileList) {
                StarBattlePlayTile starBattlePlayTile = (StarBattlePlayTile) tile;
                if (starBattlePlayTile.getTileState().equals(TileState.CHECKED)) {
                    System.out.print("[*]");
                } else if (starBattlePlayTile.getTileState().equals(TileState.EXCLUDED)) {
                    System.out.print("[o]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println("");
        }
    }
}
