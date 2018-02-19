package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if(handSign.equals("rock"));
        return "paper";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if(handSign.equals("rock"));
        return "scissor";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        //pseudo-code(thought process)
        //if hs1.equals(rock) && hs2.equals(paper)
        //then return hs2 hand sign
        //else if hs1.equals(rock) && hs2.equals(scissor)
        //then return hs1 hand sign

            if(handSignOfPlayer1.equals(ROCK)&&handSignOfPlayer2.equals(PAPER)) {
                return handSignOfPlayer2.toString();
            } else if(handSignOfPlayer1.equals(ROCK)&&handSignOfPlayer2.equals(SCISSOR)) {
                return handSignOfPlayer1.toString();
            }

        return handSignOfPlayer1;
    }

}
