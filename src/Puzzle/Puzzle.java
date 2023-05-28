package Puzzle;

/**
 * This class provides a template for all the various puzzles available.
 */
public abstract class Puzzle {

    /**
     * The size of the Puzzle's grid.
     */
    private final int GRID_SIZE;
    /**
     * The Puzzle's {@link Grid}.
     */
    private Grid GRID;
    /**
     * Whether the Puzzle's Grid has a perimeter containing necessary data.
     */
    private final boolean HAS_PERIMETER;

    public Puzzle(int GRID_SIZE, boolean HAS_PERIMETER) {
        this.GRID_SIZE = GRID_SIZE;
        this.HAS_PERIMETER = HAS_PERIMETER;
    }
}
