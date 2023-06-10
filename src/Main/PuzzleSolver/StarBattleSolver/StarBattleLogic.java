package Main.PuzzleSolver.StarBattleSolver;

import Main.Puzzle.StarBattle.*;
import Main.Puzzle.TileState;

/**
 * This class sets out the logic and rules of the gameplay.
 */
public class StarBattleLogic {

    /**
     * Marks a given {@link StarBattlePlayTile} as {@link TileState#CHECKED}.
     * Marks the adjacent Tiles as {@link TileState#EXCLUDED}
     * using the {@link #markAdjacentTilesExcluded(StarBattleGrid, StarBattlePlayTile)} method.
     * Checks the row, column, and tile group of the tile, anf if any of them contains  the maximum amount of stars,
     * excludes the remaining tiles.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param starBattleGrid The Grid.
     * @param starBattlePlayTile The StarBattlePlayTile that contains a star.
     */
    public static void markAsStar(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        starBattlePlayTile.setTileState(TileState.CHECKED);
        markAdjacentTilesExcluded(starBattleGrid, starBattlePlayTile);

        int row = starBattlePlayTile.getY();
        int column = starBattlePlayTile.getX();
        String tileGroup = starBattlePlayTile.getTILE_GROUP();

        if (rowHasMaxStars(starBattlePuzzle, starBattleGrid, row)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileRow(row));
        }

        if (columnHasMaxStars(starBattlePuzzle, starBattleGrid, column)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileColumn(column));
        }

        if (groupHasMaxStars(starBattlePuzzle, starBattleGrid, tileGroup)) {
            StarBattleLogicAssist.excludeRemainder(starBattleGrid.getTileGroup(tileGroup));
        }
    }

    public static void markAsExcluded(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        starBattlePlayTile.setTileState(TileState.EXCLUDED);
    }

    /**
     * {@link StarBattlePlayTile}s that contain stars ({@link Main.Puzzle.TileState#CHECKED})
     * cannot be adjacent. Therefore, if a StarBattlePlayTile contains a star, this method
     * marks all the adjacent StarBattlePlayTiles as {@link Main.Puzzle.TileState#EXCLUDED}.
     *
     * @param starBattleGrid The Grid of the {@link StarBattlePuzzle} being solved.
     * @param starBattlePlayTile The {@link StarBattlePlayTile} that contains a star.
     */
    public static void markAdjacentTilesExcluded(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        StarBattleLogicAssist.excludeUp(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeUpRight(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeRight(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeDownRight(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeDown(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeDownLeft(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeLeft(starBattleGrid, starBattlePlayTile);
        StarBattleLogicAssist.excludeUpLeft(starBattleGrid, starBattlePlayTile);

    }

    /**
     * Determines whether a row in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param starBattleGrid The Grid.
     * @param row Index of the row (starting from 0).
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean rowHasMaxStars(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, int row) {
        return StarBattleLogicAssist.hasMaxStars(starBattlePuzzle, starBattleGrid.getTileRow(row));
    }

    /**
     * Determines whether a column in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param starBattleGrid The Grid.
     * @param column Index of the column (starting from 0).
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean columnHasMaxStars(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, int column) {
        return StarBattleLogicAssist.hasMaxStars(starBattlePuzzle, starBattleGrid.getTileColumn(column));
    }

    /**
     * Determines whether a row in a given {@link StarBattleGrid} has the maximum amount of
     * stars.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     * @param starBattleGrid The Grid.
     * @param tileGroup letter of the group.
     * @return True if the maximum amount of stars has been reached, false if not.
     */
    public static boolean groupHasMaxStars(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, String tileGroup) {
        return StarBattleLogicAssist.hasMaxStars(starBattlePuzzle, starBattleGrid.getTileGroup(tileGroup));
    }


}
