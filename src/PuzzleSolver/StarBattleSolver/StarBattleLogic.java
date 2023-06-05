package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.*;
import Puzzle.TileState;

/**
 * This class sets out the logic and rules of the gameplay.
 */
public class StarBattleLogic {

    /**
     * Marks a given {@link StarBattlePlayTile} as {@link TileState#CHECKED}
     * and marks the adjacent Tiles as {@link TileState#EXCLUDED} using the {@link #markAdjacentTilesBlank(StarBattleGrid, StarBattlePlayTile)} method.
     *
     * @param starBattleGrid The Grid of the {@link StarBattlePuzzle} being solved.
     * @param starBattlePlayTile The StarBattlePlayTile that contains a star.
     */
    public static void markAsStar(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
        starBattlePlayTile.setTileState(TileState.CHECKED);
        markAdjacentTilesBlank(starBattleGrid, starBattlePlayTile);
    }

    /**
     * {@link StarBattlePlayTile}s that contain stars ({@link Puzzle.TileState#CHECKED})
     * cannot be adjacent. Therefore, if a StarBattlePlayTile contains a star, this method
     * marks all the adjacent StarBattlePlayTiles as {@link Puzzle.TileState#EXCLUDED}.
     *
     * @param starBattleGrid The Grid of the {@link StarBattlePuzzle} being solved.
     * @param starBattlePlayTile The {@link StarBattlePlayTile} that contains a star.
     */
    public static void markAdjacentTilesBlank(StarBattleGrid starBattleGrid, StarBattlePlayTile starBattlePlayTile) {
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
     *
     * @param starBattlePuzzle
     * @param starBattleGrid
     * @param row
     * @return
     */
    public static boolean rowHasMaxStars(StarBattlePuzzle starBattlePuzzle, StarBattleGrid starBattleGrid, int row) {
        return StarBattleLogicAssist.hasMaxStars(starBattlePuzzle, starBattleGrid.getTileRow(row));
    }


}
