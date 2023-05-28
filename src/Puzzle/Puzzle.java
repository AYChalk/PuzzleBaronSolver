package Puzzle;

/**
 * This class provides a template for all the various puzzles available.
 */
public abstract class Puzzle {

    /**
     * The size of the Puzzle's grid.
     */
    private int gridSize;
    /**
     * The Puzzle's {@link Grid}.
     */
    private Grid grid;
    /**
     * Whether the Puzzle's Grid has a perimeter containing necessary data.
     */
    private boolean hasPerimeter;
}
