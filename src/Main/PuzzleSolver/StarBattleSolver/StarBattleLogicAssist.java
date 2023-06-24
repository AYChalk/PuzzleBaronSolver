package Main.PuzzleSolver.StarBattleSolver;

import Main.Puzzle.StarBattle.*;
import Main.Puzzle.TileState;

import java.util.ArrayList;
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
     * @param starBattlePlayTile The {@link StarBattlePlayTile} whose neighbours you want to find.
     * @return A List of the neighbouring Tiles.
     */
    public static List<StarBattlePlayTile> surroundingTiles(StarBattlePlayTile starBattlePlayTile) {
        List<StarBattlePlayTile> surroundingTiles = new ArrayList<>();
        try {
            surroundingTiles.add(findUp(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findUpRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findDownRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findDown(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findDownLeft(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findLeft(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            surroundingTiles.add(findUpLeft(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}

        return surroundingTiles;
    }

    /**
     * Given a List of {@link StarBattlePlayTile}s, will find all the distinct Tile groups
     * that the elements of said list belong to.
     *
     * @param tileList The list of tiles.
     * @return All the distinct tile groups.
     */
    public static List<List<StarBattlePlayTile>> tileGroups(List<StarBattlePlayTile> tileList) {
        List<List<StarBattlePlayTile>> tileGroups = new ArrayList<>();
        List<StarBattlePlayTile> tileGroup;

        for (StarBattlePlayTile starBattlePlayTile: tileList) {
            tileGroup = starBattleGrid.getTileGroup(starBattlePlayTile.getTILE_GROUP());
            if (!tileGroups.contains(tileGroup)) {
                tileGroups.add(tileGroup);
            }
        }

        return tileGroups;
    }

    /**
     * Marks the adjacent up {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUp(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findUp(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findUpRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-right {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownRight(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findDownRight(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDown(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findDown(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent down-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeDownLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findDownLeft(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findLeft(starBattlePlayTile));
        } catch (IndexOutOfBoundsException ignored) {}
    }

    /**
     * Marks the adjacent up-left {@link StarBattlePlayTile} as {@link  TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The Tile.
     */
    public static void excludeUpLeft(StarBattlePlayTile starBattlePlayTile) {

        try {
            StarBattleLogic.markAsExcluded(findUpLeft(starBattlePlayTile));
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

    /**
     * Checks the amount of {@link StarBattlePlayTile} in a given region (row, column, or tile group)
     * that are marked as {@link TileState#BLANK} and the amount which are marked as {@link TileState#CHECKED}.
     * If the amount of remaining blank tiles is equal to the amount of stars necessary to make up
     * {@link StarBattlePuzzle#getSTARS()}, it marks the remaining blank tiles as stars.
     *
     * @param tileList The region being checked.
     */
    public static void checkAndFillBlanks(List<StarBattlePlayTile> tileList) {
        int maxStars = starBattlePuzzle.getSTARS();
        int regionStars = numberOfStars(tileList);
        int regionBlanks = numberOfBlanks(tileList);

        if (maxStars - regionStars == regionBlanks) {
            for (StarBattlePlayTile starBattlePlayTile : tileList) {
                if (starBattlePlayTile.getTileState().equals(TileState.BLANK)) {
                    starBattlePlayTile.setTileState(TileState.CHECKED);
                }
            }
        }
    }

    /**
     * Checks a given region (row, column, tile group) of {@link StarBattlePlayTile}s
     * and determines whether there would be enough {@link TileState#BLANK} tiles remaining
     * to accommodate the remaining stars that need to be added to the region, if a certain number
     * of them were to be excluded.
     *
     * @param tileList The region being examined.
     * @param excluded The number of tiles being hypothetically excluded.
     * @return true, if there would be enough blank tiles left, even after excluding this amount.
     *          false if not.
     */
    public static boolean enoughTiles(List<StarBattlePlayTile> tileList, int excluded) {
        int stars = numberOfStars(tileList);
        int remainingStars = starBattlePuzzle.getSTARS() - stars;
        int blanks = numberOfBlanks(tileList);
        int remainingBlanks = blanks - excluded;

        return remainingBlanks >= remainingStars;
    }

}
