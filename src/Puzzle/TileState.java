package Puzzle;

/**
 * This Enum indicates/determines the content of any given {@link PlayTile}.
 */
public enum TileState {
    /**
     * The {@link PlayTile} has nothing in it.
     * This is the default state when a GameTile is constructed i.e. the player has not yet entered anything into it.
     * Players can also clear the contents of a GameTile in which case it will once again be blank.
     */
    BLANK,
    /**
     * The {@link PlayTile} has been excluded from having anything in it.
     */
    EXCLUDED,
    /**
     * The {@link PlayTile} has been selected by the player.
     * This differs from Puzzle to Puzzle.
     */
    CHECKED;

}
