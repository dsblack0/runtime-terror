package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

public class CoinCountFRQ4 {

    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played

    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
     */
    public int getPlayer1Move(int round) {
        if ((round % 3) == 0){
            return 1;
        }
        else if (((round % 2) == 0) || round == 1) {
            return 2;
        }
        else {
            return 3;
        }
    }

    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
     */
    public int getPlayer2Move(int round) {
        if ((round % 3) == 0){
            return 3;
        }
        else if ((round % 2) == 0) {
            return 2;
        }
        else {
            return 1;
        }
    }

    /** Plays a simulated game between two players, as described in part (b).
     */
    public String playGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
        int player1 = startingCoins;
        int player2 = startingCoins;
        int spent1;
        int spent2;
        String outcome;
        for (int index = 1; index < maxRounds; index++){
            spent1 = getPlayer1Move(index);
            spent2 = getPlayer2Move(index);
            player1 = player1 - spent1;
            player2 = player2 - spent2;
            if (spent1 == spent2){
                player2 += 1;
            }
            else if ((Math.abs(spent1-spent2)) == 1){
                player2 += 1;
            }
            else {
                player1 += 2;
            }
        }
        if (player1 == player2) {
            outcome = "tie game";
        }
        else if (player1 < player2){
            outcome = "player 1 wins";
        }
        else {
            outcome = "player 2 wins";
        }
        return outcome;
    }
}
