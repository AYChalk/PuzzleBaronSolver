package Puzzle.StarBattle;

import Puzzle.PlayTile;
import Puzzle.TileState;

public class StarBattlePlayTile extends PlayTile {

    private final String tileGroup;

    /**
     * Constructs a PlayTile at position (x,y) on the {@link Puzzle}s {@link StarBattleGrid}.
     * The PlayTile's tileState is always initialised as {@link TileState#BLANK}.
     * i.e. when a PlayTile is constructed the player has not yet determined its final state.
     *
     * @param X  The x value of the Tile's position on the {@link StarBattleGrid}.
     * @param Y  The y value of the Tile's position on the {@link StarBattleGrid}.
     * @param ID The unique ID of the Tile.
     */
    public StarBattlePlayTile(int X, int Y, int ID, String tileGroup) {
        super(X, Y, ID);
        this.tileGroup = tileGroup;
    }
}
