package Puzzle;

/**
 * This class provides a template for the Tiles the player interacts with.
 * <p>
 * The contents of the Tile can be changed by clicking on them. The Tile's content defines the {@link TileState}.
 *
 */
public class PlayTile extends Tile {

    /**
     * The Tile's contents.
     */
    private TileState tileState;

    /**
     * Constructs a PlayTile at position (x,y) on the {@link Puzzle}s {@link Grid}.
     * The PlayTile's {@link #tileState} is always initialised as {@link TileState#BLANK}.
     * i.e. when a PlayTile is constructed the player has not yet determined its final state.
     *
     * @param X The x value of the Tile's position on the {@link Grid}.
     * @param Y The y value of the Tile's position on the {@link Grid}.
     * @param ID The unique ID of the Tile.
     */
    public PlayTile(int X, int Y, int ID) {
        super(X, Y, ID);
        tileState = TileState.BLANK;
    }

    /**
     * @return The Tile's current contents/state.
     */
    public TileState getTileState() {
        return tileState;
    }

    /**
     * Sets the Tile's contents/state.
     *
     * @param tileState the new {@link TileState}.
     */
    public void setTileState(TileState tileState) {
        this.tileState = tileState;
    }
}
