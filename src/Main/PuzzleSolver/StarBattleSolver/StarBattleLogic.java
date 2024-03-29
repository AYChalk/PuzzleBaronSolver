package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.*;
import Puzzle.TileState;

import java.util.List;
import java.util.Map;

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
        StarBattleSolver.incrementCurrentStars();
        markAdjacentTilesExcluded(starBattlePlayTile);

        int row = starBattlePlayTile.getROW();
        int column = starBattlePlayTile.getCOLUMN();
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
        if (!starBattlePlayTile.getTileState().equals(TileState.BLANK)) {
            return;
        }
        starBattlePlayTile.setTileState(TileState.EXCLUDED);
        StarBattleSolver.incrementCurrentExcluded();


        int row = starBattlePlayTile.getROW();
        int column = starBattlePlayTile.getCOLUMN();
        String tileGroup = starBattlePlayTile.getTILE_GROUP();

        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileRow(row));
        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileColumn(column));
        StarBattleLogicAssist.checkAndFillBlanks(starBattleGrid.getTileGroup(tileGroup));

    }

    /**
     * {@link StarBattlePlayTile}s that contain stars ({@link Puzzle.TileState#CHECKED})
     * cannot be adjacent. Therefore, if a StarBattlePlayTile contains a star, this method
     * marks all the adjacent StarBattlePlayTiles as {@link Puzzle.TileState#EXCLUDED}.
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

    /**
     * Checks a given {@link StarBattlePlayTile}, if by marking it as {@link TileState#CHECKED}
     * and therefore its surrounding tiles as {@link TileState#EXCLUDED}, if there would be enough
     * {@link TileState#BLANK} Tiles remaining to accommodate the necessary amount of stars.
     * If not, the Tile is marked as excluded.
     *
     * @param starBattlePlayTile the Tile being checked.
     */
    public static void checkIfViable(StarBattlePlayTile starBattlePlayTile) {
        List<StarBattlePlayTile> surroundingTiles = StarBattleLogicAssist.surroundingTiles(starBattlePlayTile);
        Map<List<StarBattlePlayTile>, Integer> tileGroupsAndMembers = StarBattleLogicAssist.tileGroupsAndMembers(surroundingTiles);
        Map<List<StarBattlePlayTile>, Integer> tileRowsAndMembers = StarBattleLogicAssist.tileRowsAndMembers(surroundingTiles);
        Map<List<StarBattlePlayTile>, Integer> tileColumnsAndMembers = StarBattleLogicAssist.tileColumnsAndMembers(surroundingTiles);

        for (Map.Entry<List<StarBattlePlayTile>, Integer> entry : tileGroupsAndMembers.entrySet()) {
            if (!StarBattleLogicAssist.enoughTiles(entry.getKey(), entry.getValue())) {
                markAsExcluded(starBattlePlayTile);
                return;
            }
        }

        for (Map.Entry<List<StarBattlePlayTile>, Integer> entry : tileRowsAndMembers.entrySet()) {
            if (!StarBattleLogicAssist.enoughTiles(entry.getKey(), entry.getValue())) {
                markAsExcluded(starBattlePlayTile);
                return;
            }
        }

        for (Map.Entry<List<StarBattlePlayTile>, Integer> entry : tileColumnsAndMembers.entrySet()) {
            if (!StarBattleLogicAssist.enoughTiles(entry.getKey(), entry.getValue())) {
                markAsExcluded(starBattlePlayTile);
                return;
            }
        }
    }



}
