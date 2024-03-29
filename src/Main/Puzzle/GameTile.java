package Puzzle;

/**
 * This class is for Tiles that are set by the game.
 * The player does not interact with these Tiles.
 *
 * In some Main.Puzzle types they can have different values.
 */
public abstract class GameTile extends Tile {
    /**
     * Constructs a GameTile at position (x,y) on the {@link Puzzle}s {@link Grid}.
     *
     * @param COLUMN The x value of the Tile's position on the {@link Grid}.
     * @param ROW The y value of the Tile's position on the {@link Grid}.
     * @param ID The unique ID of the Tile.
     */
    public GameTile(int COLUMN, int ROW, int ID) {
        super(COLUMN, ROW, ID);
    }
}
