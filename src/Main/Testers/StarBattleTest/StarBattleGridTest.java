package Testers.StarBattleTest;

import Puzzle.StarBattle.StarBattleGrid;
import Puzzle.StarBattle.StarBattlePlayTile;
import Puzzle.Tile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StarBattleGridTest {

    private static StarBattleGrid starBattleGrid;

    private static List<String> groups;

    private static int gridSize;

    private static int starCount;

    public static void test() {
        testGetGrid();
        testGetGroup();
        testGetRow();
        testGetColumn();
    }


    private static void testGetGrid() {
        System.out.println("Test getGrid:");

        List<List<? extends Tile>> grid = starBattleGrid.getGRID();

        for (List<? extends Tile> row : grid) {
            for (Tile tile : row) {
                StarBattlePlayTile starBattlePlayTile = (StarBattlePlayTile) tile;
                System.out.print(starBattlePlayTile.getTileState().name() + starBattlePlayTile.getID() + " ");
             }
            System.out.println();
        }
    }

    private static void testGetGroup() {
        System.out.println("Test getGroup:");

        List<StarBattlePlayTile> tileGroup;

        for (String group : groups) {
            tileGroup = starBattleGrid.getTileGroup(group);

            tileGroup.forEach(tile -> System.out.print(tile.getTILE_GROUP() + ":" + tile.getID() + " "));
            System.out.println();
        }
    }

    private static void testGetRow() {
        System.out.println("Test getRow");

        List<StarBattlePlayTile> tileRow;

        for (int i = 0; i < gridSize; i++) {
            tileRow = starBattleGrid.getTileRow(i);

            tileRow.forEach(tile -> System.out.print(tile.getROW() + ":" + tile.getID() + " "));
            System.out.println();
        }
    }

    private static void testGetColumn() {
        System.out.println("Test getColumn");

        List<StarBattlePlayTile> tileColumn;

        for (int i = 0; i < gridSize; i++) {
            tileColumn = starBattleGrid.getTileColumn(i);

            tileColumn.forEach(tile -> System.out.print(tile.getCOLUMN() + ":" + tile.getID() + " "));
            System.out.println();
        }
    }

    public static StarBattleGrid getStarBattleGrid() {
        return starBattleGrid;
    }

    public static void setStarBattleGrid(StarBattleGrid starBattleGrid) {
        StarBattleGridTest.starBattleGrid = starBattleGrid;
    }

    public static void setGroups(List<String> groups) {
        StarBattleGridTest.groups = groups;
    }

    public static void setGridSize(int gridSize) {
        StarBattleGridTest.gridSize = gridSize;
    }

    public static void setStarCount(int starCount) {
        StarBattleGridTest.starCount = starCount;
    }
}
