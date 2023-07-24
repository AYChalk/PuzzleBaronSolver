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

    private static StarBattleGrid starBattleGrid = null;


    private static final List<String> groups = new ArrayList<>();

    private static int gridSize;

    private static int starCount;

    public static void test() {
        gridInput();
        testGetGrid();
        testGetGroup();
        testGetRow();
        testGetColumn();
    }

    private static void gridInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[][] tileInfo = new String[8][8];

            System.out.println("Grid size:");
            gridSize = Integer.parseInt(reader.readLine());

//            System.out.println("Star count:");
//            starCount = Integer.parseInt(reader.readLine());

            System.out.println("Tile info:");
            for (int i = 0; i < gridSize; i++) {
                String[] row = reader.readLine().split(" ");
                tileInfo[i] = row;

                starBattleGrid = new StarBattleGrid(gridSize, tileInfo);

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
}
