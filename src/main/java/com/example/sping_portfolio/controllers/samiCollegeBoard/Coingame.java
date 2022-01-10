package com.example.sping_portfolio.controllers.samiCollegeBoard;

public class Coingame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    public Coingame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.*/
    public int getPlayer1Move(int round) {
        if(round % 3 == 0) return 3;
        if (round % 2 == 0) return 2;
        return 1;
    }
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).*/
    public int getPlayer2Move(int round) {
        if(round % 3 == 0) return 3;
        if (round % 2 == 0) return 2;
        return 1;
    }
    /** Plays a simulated game between two players, as described in part (b).*/
    public String playGame(int startingCoins, int maxRounds) {
        int playerOneCoins = this.startingCoins;
        int playerTwoCoins = this.startingCoins;

        int numberOfRoundsLeft = this.maxRounds;

        while (playerOneCoins > 3 && playerTwoCoins > 3 && numberOfRoundsLeft > 0) {

            numberOfRoundsLeft--;
            int m1 = getPlayer1Move(startingCoins);
            int m2 = getPlayer2Move(startingCoins);

            playerOneCoins -= m1;
            playerTwoCoins -= m2;

            if (m1 == m2) playerTwoCoins += 1;
            if (m1 - m2 == 1) playerTwoCoins += 1;
            if (m1 - m2 == 2) playerOneCoins += 1;

        }
        String result;

        if (playerOneCoins > playerTwoCoins) {
            result = "Player 1 wins!";
        } else if (playerTwoCoins > playerOneCoins) {
            result = "Player 2 wins!";
        } else {
            result = "Tie game!";
        }
        return result;

    }
}

