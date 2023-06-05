package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.*;
import Puzzle.TileState;

import java.util.List;

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

    /**
     * Calculates the amount of stars ({@link TileState#CHECKED}) in a given region
     * (row, colum or tile group).
     *
     * @param tileList The region being checked.
     * @return The amount of {@link StarBattlePlayTile}s that contain stars.
     */
    public static int numberOfStars(List<StarBattlePlayTile> tileList) {
        int result = 0;

        for (StarBattlePlayTile starBattlePlayTile : tileList) {
            if (starBattlePlayTile.getTileState().equals(TileState.CHECKED)) {
                result++;
            }
        }

        return result;
    }

    /**
     * Determines whether a given region (row, column, or tile group) in the {@link StarBattleGrid}
     * has the maximum possible amount of stars ({@link TileState#CHECKED}).
     * <p>
     * The maximum amount of stars/region is determined by {@link StarBattlePuzzle#getSTARS()}.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param tileList The region being checked.
     * @return True, if the maximum amount of stars has been reached, false if not.
     */
    public static boolean hasMaxStars(StarBattlePuzzle starBattlePuzzle, List<StarBattlePlayTile> tileList) {
        int maxStars = starBattlePuzzle.getSTARS();
        int currentStars = numberOfStars(tileList);

        return maxStars == currentStars;
    }
}
