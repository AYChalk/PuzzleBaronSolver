package Puzzle.StarBattle;

import Puzzle.Grid;
import Puzzle.Tile;

public class StarBattleGrid extends Grid {

    /**
     * Constructs a Grid of size * size and initialises the {@link Grid}s GRID field.
     * <p>
     * In the children classes, the grid would be populated with {@link Tile}s,
     * using the {@link #gridFiller(String[][])} method.
     * However, in this class the gridFiller() method is abstract.
     *
     * @param size     The SIZE of the Grid.
     * @param tileInfo The information passed to the gridFiller() method.
     */
    public StarBattleGrid(int size, String[][] tileInfo) {
        super(size, tileInfo);
    }

    @Override
    public void gridFiller(String[][] tileInfo) {

    }
}
