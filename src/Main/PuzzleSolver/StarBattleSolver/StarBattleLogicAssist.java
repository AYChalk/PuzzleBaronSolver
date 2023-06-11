package Main.PuzzleSolver.StarBattleSolver;

import Main.Puzzle.StarBattle.*;
import Main.Puzzle.TileState;

import java.util.List;

/**
 * This class provides helper methods for the {@link  StarBattleLogic} class.
 */
public class StarBattleLogicAssist {

    /**
     * The {@link StarBattlePuzzle} being solved.
     */
    private static StarBattlePuzzle starBattlePuzzle;

    /**
     * The {@link StarBattleGrid} of the {@link StarBattlePuzzle} being solved.
     */
    private static StarBattleGrid starBattleGrid;

    /**
     * Sets the value of {@link #starBattlePuzzle} and {@link #starBattleGrid}.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     */
    public static void setStarBattlePuzzle(StarBattlePuzzle starBattlePuzzle) {
        StarBattleLogicAssist.starBattlePuzzle = starBattlePuzzle;
        StarBattleLogicAssist.starBattleGrid = starBattlePuzzle.getSTAR_BATTLE_GRID();
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUp(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up-right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUpRight(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x+1);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findRight(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x+1);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down-right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDownRight(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x+1);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDown(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down-left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDownLeft(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x-1);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findLeft(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x-1);
    }

    /**
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up-left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUpLeft(StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x-1);
    }

    /**
     * Marks the adjacent up {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUp(StarBattlePlayTile starBattlePlayTile) {

        try {
            findUp(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            findUpRight(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            findRight(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            findDownRight(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDown(StarBattlePlayTile starBattlePlayTile) {

        try {
            findDown(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            findDownLeft(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            findLeft(starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            findUpLeft(starBattlePlayTile).setTileState(TileState.EXCLUDED);
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
        int count = 0;

        for (StarBattlePlayTile starBattlePlayTile : tileList) {
            if (starBattlePlayTile.getTileState().equals(TileState.CHECKED)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Calculates the amount of blanks ({@link TileState#BLANK}) in a given region
     * (row, colum or tile group).
     *
     * @param tileList The region being checked.
     * @return The amount of {@link StarBattlePlayTile}s that are blank.
     */
    public static int numberOfBlanks(List<StarBattlePlayTile> tileList) {
        int count = 0;

        for (StarBattlePlayTile starBattlePlayTile : tileList) {
            if (starBattlePlayTile.getTileState().equals(TileState.BLANK)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Determines whether a given region (row, column, or tile group) in the {@link StarBattleGrid}
     * has the maximum possible amount of stars ({@link TileState#CHECKED}).
     * <p>
     * The maximum amount of stars/region is determined by {@link StarBattlePuzzle#getSTARS()}.
     *
     * @param tileList The region being checked.
     * @return True, if the maximum amount of stars has been reached, false if not.
     */
    public static boolean hasMaxStars(List<StarBattlePlayTile> tileList) {
        int maxStars = starBattlePuzzle.getSTARS();
        int currentStars = numberOfStars(tileList);

        return maxStars == currentStars;
    }

    /**
     * Once a region (row, column, or tile group) contains the maximum amount of stars
     * excludes the remaining {@link StarBattlePlayTile}s.
     *
     * @param tileList The region of Tiles.
     */
    public static void excludeRemainder(List<StarBattlePlayTile> tileList) {
        for (StarBattlePlayTile tile : tileList) {
            if (tile.getTileState().equals(TileState.BLANK)) {
                tile.setTileState(TileState.EXCLUDED);
            }
        }
    }

}
