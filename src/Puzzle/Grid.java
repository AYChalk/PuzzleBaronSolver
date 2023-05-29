package Puzzle;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a template for the grid each puzzle has.
 * <p>
 * All Grids are squares of {@link #SIZE} * size {@link Tile}s.
 */
public abstract class Grid {

    /**
     * The size of the Grid. This is set upon construction of a Grid.
     * <p>
     * It is immutable; the variable is final.
     */
    private final int SIZE;

    /**
     * A 2D List containing {@link Tile}s.
     * This is the Grid that makes up the Puzzle.
     * <p>
     * Upon construction of a Grid object it should be populated with Tiles.
     * <p>
     * It is immutable; the variable is final.
     */
    private final List<List<Tile>> GRID;

    /**
     * Constructs a Grid of size * size and initialises the {@link #GRID} field.
     * <p>
     * In the children classes, the grid would be populated with {@link Tile}s,
     * using the {@link #gridFiller(String[][])} method.
     * However, in this class the gridFiller() method is abstract.
     *
     * @param size The {@link #SIZE} of the Grid.
     * @param tileInfo The information passed to the gridFiller() method.
     */
    public Grid(int size, String[][] tileInfo) {
        SIZE = size;
        GRID = new ArrayList<>();
        gridFiller(tileInfo);
    }

    /**
     * This method is for populating the {@link #GRID} with {@link Tile}s.
     * <p>
     * The method iterates over the GRID and adds {@link #SIZE} number of List<Tile>,
     * each containing SIZE number of Tiles.
     * <p>
     * The parameters of the Tiles to be constructed are contained in the tileInfo parameter.
     * As the Tile classes in this package are abstract, this method is also abstract.
     *
     * @param tileInfo information pertaining to the Tiles.
     */
    public abstract void gridFiller(String[][] tileInfo);

}
