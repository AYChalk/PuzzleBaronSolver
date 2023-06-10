package Main.PuzzleSolver.StarBattleSolver;

import Main.Puzzle.StarBattle.*;
import Main.Puzzle.TileState;

import java.util.List;

/**
 * This class provides helper methods for the {@link  StarBattleLogic} class.
 */
public class StarBattleLogicAssist {

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUp(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up-right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUpRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x+1);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x+1);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down-right {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDownRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x+1);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDown(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent down-left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findDownLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y+1).get(x-1);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y).get(x-1);
    }

    /**
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     * @return The adjacent up-left {@link StarBattlePlayTile}.
     * @throws IndexOutOfBoundsException If the adjacent Tile would be outside the Grid's parameters.
     */
    public static StarBattlePlayTile findUpLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) throws IndexOutOfBoundsException {
        int x = starBattlePlayTile.getX();
        int y = starBattlePlayTile.getY();

        return (StarBattlePlayTile) starBattleGrid.getGRID().get(y-1).get(x-1);
    }

    /**
     * Marks the adjacent up {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUp(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findUp(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findUpRight(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findRight(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownRight(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findDownRight(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDown(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findDown(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findDownLeft(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findLeft(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattleGrid The {@link StarBattleGrid} of the current {@link StarBattlePuzzle}.
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpLeft(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {

        try {
            findUpLeft(starBattleGrid, starBattlePlayTile).setTileState(TileState.EXCLUDED);
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
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param tileList The region being checked.
     * @return True, if the maximum amount of stars has been reached, false if not.
     */
    public static boolean hasMaxStars(StarBattlePuzzle starBattlePuzzle, List<StarBattlePlayTile> tileList) {
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
