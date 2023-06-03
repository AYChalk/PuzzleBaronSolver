package Puzzle.StarBattle;

import Puzzle.Puzzle;
import Puzzle.Tile;
import Puzzle.TileState;

/**
 * This Class represents the StarBattle puzzle that can be found
 * on the <a href="https://starbattle.puzzlebaron.com/">PuzzleBaron</a> website.
 * <p></p>
 * This Puzzle's gameplay is as follows:
 * <ul>
 *     <li>The player chooses the size of the Puzzle's grid.</li>
 *     <li>The player chooses the amounts of stars in the grid (x).</li>
 *     <li>A grid of size * size tiles is created.</li>
 *     <li>Each of the tiles also belongs to a "group".</li>
 *     <li>Each row and column in the grid, as well as each group, have to contain exactly x amount of stars.</li>
 *     <li>Stars cannot touch each other (orthogonally).</li>
 *     <li>The game is over once all the stars have been placed in the correct position.</li>
 * </ul>
 */
public class StarBattlePuzzle extends Puzzle {

    private final StarBattleGrid STAR_BATTLE_GRID;

    /**
     * The amount of stars ({@link TileState#CHECKED} {@link StarBattlePlayTile}s) per row, column, and shape
     * on the {@link StarBattleGrid}.
     * <p>
     * The value is set on construction and is immutable.
     */
    private final int STARS;


    /**
     * Constructs a new Puzzle and creates the Puzzle's Grid.
     *
     * @param GRID_SIZE The size of the Puzzle's Grid.
     * @param tileInfo  The information pertaining to the {@link Tile}s that populate the GRID.
     *                  In this class, the only information require is the {@link StarBattlePlayTile}s
     *                  ID. This is in the form of a single alphabetical character.
     */
    public StarBattlePuzzle(int GRID_SIZE, String[][] tileInfo, int STARS) {
        super(GRID_SIZE, tileInfo);
        this.STARS = STARS;
        this.STAR_BATTLE_GRID = new StarBattleGrid(GRID_SIZE, tileInfo);
    }

    /**
     * @return the {@link #STARS} field.
     */
    public int getSTARS() {
        return STARS;
    }

}
