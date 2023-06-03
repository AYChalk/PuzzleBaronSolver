package Puzzle.StarBattle;

import Puzzle.Grid;
import Puzzle.Tile;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the grid in which the puzzle's tile are placed.
 */
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

    /**
     * Fills the Grid with {@link StarBattlePlayTile}s.
     *
     * @param tileInfo information pertaining to the Tiles.
     */
    @Override
    public void gridFiller(String[][] tileInfo) {
        int size = getSIZE();
        int id = 0;
        List<StarBattlePlayTile> tiles;
        String tileGroup;

        for (int i = 0; i < size; i++){
            tiles = new ArrayList<>();
            for (int j = 0; j < size; j++){
                tileGroup = tileInfo[id][0];
                tiles.add(new StarBattlePlayTile(i, j, id, tileGroup));
                id++;
            }
            this.getGRID().add(tiles);
        }
    }

    /**
     * Finds all the Tiles of a given Tile Group.
     *
     * @param tileGroup the Tile Group to be found.
     * @return a List of all the Tiles that belong to the group.
     */
    public List<StarBattlePlayTile> getTileGroup(String tileGroup) {
        List<StarBattlePlayTile> group = new ArrayList<>();

        StarBattlePlayTile starBattlePlayTile;

        for (List<? extends Tile> tileList : this.getGRID()) {
            for (Tile tile : tileList) {
                starBattlePlayTile = (StarBattlePlayTile) tile;

                if (starBattlePlayTile.getTILE_GROUP().equals(tileGroup)) {
                    group.add(starBattlePlayTile);
                }
            }
        }

        return group;
    }

    /**
     * Finds all the Tiles of a given column.
     *
     * @param tileColumn the desired column number from the Grid (starting from 0)
     * @return a List populated with all the {@link StarBattlePlayTile}s in the specified column.
     */
    public List<StarBattlePlayTile> getTileColumn(int tileColumn) {
        List<StarBattlePlayTile> column = new ArrayList<>();

        for (List<? extends Tile> tileList : this.getGRID()) {
            column.add((StarBattlePlayTile) tileList.get(tileColumn));
        }

        return column;
    }
}
