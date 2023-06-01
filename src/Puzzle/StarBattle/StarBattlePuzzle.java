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

    /**
     * The amount of stars ({@link TileState#CHECKED} {@link StarBattlePlayTile}s) per row, column, and shape
     * on the {@link StarBattleGrid}.
     * <p>
     * The value is set on construction and is immutable.
     */
    private final int STARS;

    /**
     * The total amount of {@link StarBattlePlayTile}s that need to be checked for the game to be over.
     */
    private final int TOTAL_STARS;

    /**
     * How many {@link StarBattlePlayTile}s on the {@link StarBattleGrid} are marked as Stars.
     */
    private int currentStars;

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
        TOTAL_STARS = GRID_SIZE * STARS;
    }

    /**
     * @return the {@link #STARS} field.
     */
    public int getSTARS() {
        return STARS;
    }

    /**
     * @return the {@link #TOTAL_STARS} field.
     */
    public int getTOTAL_STARS() {
        return TOTAL_STARS;
    }

    /**
     * @return the {@link #currentStars} field.
     */
    public int getCurrentStars() {
        return currentStars;
    }

    /**
     * @param currentStars the new value of the {@link #currentStars}
     */
    public void setCurrentStars(int currentStars) {
        this.currentStars = currentStars;
    }

    /**
     * Increments the {@link #currentStars} value by one and, if it equals {@link #TOTAL_STARS},
     * sets the value of gameOver to true.
     */
    public void incrementStars() {
        this.currentStars++;
        if (currentStars == TOTAL_STARS) {
            setGameOver(true);
        }
    }
}
