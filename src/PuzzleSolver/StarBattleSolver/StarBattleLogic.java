package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.*;

/**
 * This class sets out the logic and rules of the gameplay.
 */
public class StarBattleLogic {

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

}
