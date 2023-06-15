package Main.PuzzleSolver.StarBattleSolver;

import Main.Puzzle.StarBattle.*;
import Main.Puzzle.TileState;

import java.util.List;

/**
 * This class sets out the logic and rules of the gameplay.
 */
public class StarBattleLogic {

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
     * Sets the same values in the {@link StarBattleLogicAssist} class by calling its
     * {@link StarBattleLogicAssist#setStarBattlePuzzle(StarBattlePuzzle)} method.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     */
    public static void setStarBattlePuzzle(StarBattlePuzzle starBattlePuzzle) {
        StarBattleLogic.starBattlePuzzle = starBattlePuzzle;
        StarBattleLogic.starBattleGrid = starBattlePuzzle.getSTAR_BATTLE_GRID();
        StarBattleLogicAssist.setStarBattlePuzzle(starBattlePuzzle);
    }

    /**
     * Marks a given {@link StarBattlePlayTile} as {@link TileState#CHECKED}.
     * Marks the adjacent Tiles as {@link TileState#EXCLUDED}
     * using the {@link #markAdjacentTilesExcluded(StarBattlePlayTile)} method.
     * Checks the row, column, and tile group of the tile, anf if any of them contains  the maximum amount of stars,
     * excludes the remaining tiles.
     *
     * @param starBattlePlayTile The StarBattlePlayTile that contains a star.
     */
    public static void markAsStar(StarBattlePlayTile starBattlePlayTile) {
        starBattlePlayTile.setTileState(TileState.CHECKED);
        markAdjacentTilesExcluded(starBattlePlayTile);

        int row = starBattlePlayTile.getY();
        int column = starBattlePlayTile.getX();
        String tileGroup = starBattlePlayTile.getTILE_GROUP();

        if (rowHasMaxStars(row)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileRow(row));
        }

        if (columnHasMaxStars(column)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileColumn(column));
        }

        if (groupHasMaxStars(tileGroup)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileGroup(tileGroup));
        }
    }

    public static void markAsExcluded(StarBattlePlayTile starBattlePlayTile) {
        starBattlePlayTile.setTileState(TileState.EXCLUDED);


        int row = starBattlePlayTile.getY();
        int column = starBattlePlayTile.getX();
        String tileGroup = starBattlePlayTile.getTILE_GROUP();

        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileRow(row));
        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileColumn(column));
        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileGroup(tileGroup));

    }

    /**
     * {@link StarBattlePlayTile}s that contain stars ({@link Main.Puzzle.TileState#CHECKED})
     * cannot be adjacent. Therefore, if a StarBattlePlayTile contains a star, this method
     * marks all the adjacent StarBattlePlayTiles as {@link Main.Puzzle.TileState#EXCLUDED}.
     *
     * @param starBattlePlayTile The {@link StarBattlePlayTile} that contains a star.
     */
    public static void markAdjacentTilesExcluded(StarBattlePlayTile starBattlePlayTile) {
        StarBattleLogicAssist.excludeUp(starBattlePlayTile);
        StarBattleLogicAssist.excludeUpRight(starBattlePlayTile);
        StarBattleLogicAssist.excludeRight(starBattlePlayTile);
        StarBattleLogicAssist.excludeDownRight(starBattlePlayTile);
        StarBattleLogicAssist.excludeDown(starBattlePlayTile);
        StarBattleLogicAssist.excludeDownLeft(starBattlePlayTile);
        StarBattleLogicAssist.excludeLeft(starBattlePlayTile);
        StarBattleLogicAssist.excludeUpLeft(starBattlePlayTile);

    }

    /**
     * Determines whether a row in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param row Index of the row (starting from 0).
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean rowHasMaxStars(int row) {
        return StarBattleLogicAssist.hasMaxStars(starBattleGrid.getTileRow(row));
    }

    /**
     * Determines whether a column in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param column Index of the column (starting from 0).
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean columnHasMaxStars(int column) {
        return StarBattleLogicAssist.hasMaxStars(starBattleGrid.getTileColumn(column));
    }

    /**
     * Determines whether a row in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param tileGroup letter of the group.
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean groupHasMaxStars(String tileGroup) {
        return StarBattleLogicAssist.hasMaxStars(starBattleGrid.getTileGroup(tileGroup));
    }

    public static void checkIfViable(StarBattlePlayTile starBattlePlayTile) {
        List<StarBattlePlayTile> surroundingTiles = StarBattleLogicAssist.surroundingTiles(starBattlePlayTile);
        List<List<StarBattlePlayTile>> tileGroups = StarBattleLogicAssist.tileGroups(surroundingTiles);
    }



}
