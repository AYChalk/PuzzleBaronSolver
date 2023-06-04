package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.*;
import Puzzle.TileState;

/**
 * This class provides helper methods for the {@link  StarBattleLogic} class.
 */
public class StarBattleLogicAssist {

    /**
     * Marks the adjacent up {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUp(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x+1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x+1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x+1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDown(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x-1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x-1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        try {
            StarBattlePlayTile starBattlePlayTile1 = (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x-1);
            starBattlePlayTile1.setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }
}
