package Main.Puzzle;

/**
 * This class provides a template for all the various puzzles available.
 */
public abstract class Puzzle {

    /**
     * The size of the Main.Puzzle's grid.
     */
    private final int GRID_SIZE;
    /**
     * The Main.Puzzle's {@link Grid}.
     */
    private Grid GRID;

    /**
     * Whether the puzzle has been completed according to its specified rules.
     */
    private boolean gameOver;

    /**
     * Constructs a new Main.Puzzle and creates the Main.Puzzle's Grid.
     *
     * @param GRID_SIZE The size of the Main.Puzzle's {@link #GRID}.
     * @param tileInfo  The information pertaining to the {@link Tile}s that populate the GRID.
     */
    public Puzzle(int GRID_SIZE,  String[][] tileInfo) {
        this.GRID_SIZE = GRID_SIZE;
        this.gameOver = false;
    }

    /**
     * @return true if the game is over, false if it isn't.
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * @param gameOver parse true if the game is over.
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
