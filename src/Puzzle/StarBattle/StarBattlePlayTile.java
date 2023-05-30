package Puzzle.StarBattle;

import Puzzle.PlayTile;
import Puzzle.TileState;

public class StarBattlePlayTile extends PlayTile {

    /**
     * Each StarBattlePlayTile belongs to a group.
     * These groups make up the various shapes on the {@link StarBattleGrid}.
     * <p>
     * Each Tile's shape is assigned upon construction and is immutable.
     */
    private final String TILE_GROUP;

    /**
     * Constructs a PlayTile at position (x,y) on the {@link Puzzle}s {@link StarBattleGrid}.
     * The PlayTile's tileState is always initialised as {@link TileState#BLANK}.
     * i.e. when a PlayTile is constructed the player has not yet determined its final state.
     *
     * @param X  The x value of the Tile's position on the {@link StarBattleGrid}.
     * @param Y  The y value of the Tile's position on the {@link StarBattleGrid}.
     * @param ID The unique ID of the Tile.
     * @param tileGroup The {@link #TILE_GROUP}
     */
    public StarBattlePlayTile(int X, int Y, int ID, String tileGroup) {
        super(X, Y, ID);
        this.TILE_GROUP = tileGroup;
    }

    /**
     * @return The {@link #TILE_GROUP}.
     */
    public String getTILE_GROUP() {
        return TILE_GROUP;
    }
}
