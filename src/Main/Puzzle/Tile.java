package Main.Puzzle;

/**
 * This class is a template for the Tile's.
 * Tile's are where the actual gameplay occurs: players click the tiles to populate them.
 * <p>
 * All Tiles have the following:
 * <ul>
 *     <li>Position: represented by x,y coordinates.</li>
 *     <li>A {@link TileState}.</li>
 * </ul>
 *
 * In addition to the TileState, Tiles can be one of two types:
 * <ul>
 *     <li>{@link GameTile}s.</li>
 *     <li>{@link PlayTile}s.</li>
 * </ul>
 *
 * Game Tiles cannot be interacted with by the player i.e. they have no Tile State.
 * Play Tile are the Tiles the player interacts with i.e. hey have a Tile State which can be changed.
 *
 */
public abstract class Tile {
    /**
     * The x value of the Tile's position on the {@link Grid}.
     * <p>
     * The Tile's position cannot change and so the variable is final.
     */
    private final int X;
    /**
     * The y value of the Tile's position on the {@link Grid}.
     * <p>
     * The Tile's position cannot change and so the variable is final.
     */
    private final int Y;
    /**
     * Each Tile has a unique ID.
     * This is assigned upon the Tile's construction and cannot be changed.
     * The variable is final.
     */
    private final int ID;

    /**
     * Constructs a new Tile, at the specified (x,y) position on the {@link Grid}.
     *
     * @param X  The x value of the Tile's position on the {@link Grid}.
     * @param Y  The y value of the Tile's position on the {@link Grid}.
     * @param ID The unique ID of the Tile.
     */
    public Tile(int X, int Y, int ID) {
        this.X = X;
        this.Y = Y;
        this.ID = ID;
    }

    /**
     * @return The {@link #X} value of the Tile's position on the {@link Grid}.
     */
    public int getX() {
        return X;
    }

    /**
     * @return The {@link #Y} value of the Tile's position on the {@link Grid}.
     */
    public int getY() {
        return Y;
    }


    /**
     * @return The Tile's unique {@link #ID}.
     */
    public int getID() {
        return ID;
    }
}
