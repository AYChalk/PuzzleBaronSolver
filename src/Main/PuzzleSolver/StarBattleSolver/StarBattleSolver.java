package PuzzleSolver.StarBattleSolver;

import Puzzle.StarBattle.StarBattleGrid;
import Puzzle.StarBattle.StarBattlePlayTile;
import Puzzle.StarBattle.StarBattlePuzzle;
import Puzzle.Tile;
import Testers.StarBattleTest.StarBattleTest;

import java.util.List;

/**
 * This class is for solving {@link StarBattlePuzzle} by using the logic set out in the {@link PuzzleSolver.StarBattleSolver.StarBattleLogic}.
 */
public class StarBattleSolver {

    /**
     * The {@link StarBattlePuzzle} being solved.
     */
    private static StarBattlePuzzle starBattlePuzzle;

    /**
     * The {@link StarBattleGrid} of the {@link #starBattlePuzzle}
     */
    private static StarBattleGrid starBattleGrid;

    /**
     * The total amount of {@link StarBattlePlayTile}s in the {@link #starBattleGrid}
     * that need to contain stars ({@link Puzzle.TileState#CHECKED}).
     */
    private static int totalStars;

    /**
     * The amount of {@link StarBattlePlayTile}s in the {@link #starBattleGrid}
     * that currently contain stars.
     * <p>
     * When this equals {@link #totalStars}, the puzzle is solved.
     */
    private static int currentStars;

    private static int currentExcluded;

    /**
     * Sets the value of {@link #starBattlePuzzle} and {@link #starBattleGrid}.
     * Sets the same values in the {@link StarBattleLogic} class by calling its
     * {@link StarBattleLogic#setStarBattlePuzzle(StarBattlePuzzle)} method.
     *
     * @param starBattlePuzzle The {@link StarBattlePuzzle} being solved.
     */
    public static void setStarBattlePuzzle(StarBattlePuzzle starBattlePuzzle) {
        starBattlePuzzle = starBattlePuzzle;
        starBattleGrid = starBattlePuzzle.getSTAR_BATTLE_GRID();
        StarBattleLogic.setStarBattlePuzzle(starBattlePuzzle);
        totalStars = starBattlePuzzle.getSTARS() * starBattleGrid.getSIZE();
        currentStars = 0;
        currentExcluded = 0;
    }

    /**
     *
     */
    public static void solve() {

        int startStars;
        int startExcluded;

        while (currentStars < totalStars) {
            startStars = currentStars;
            startExcluded = currentExcluded;

            List<List<? extends Tile>> tileGrid = starBattleGrid.getGRID();
            for (List<? extends Tile> tileList : tileGrid) {
                for (Tile tile : tileList) {
                    StarBattlePlayTile starBattlePlayTile = (StarBattlePlayTile) tile;
                    StarBattleLogic.checkIfViable(starBattlePlayTile);

                    StarBattleTest.printGrid();
                    System.out.println("");
                }
            }

            if (startStars == currentStars && startExcluded == currentExcluded) {
                System.out.println("Stuck");
                return;
            }
        }

        System.out.println("Solved");

    }

    /**
     * Increments the {@link #currentStars} field by one.
     */
    public static void incrementCurrentStars() {
        currentStars++;
    }

    public static void incrementCurrentExcluded() {
        currentExcluded++;
    }


}
