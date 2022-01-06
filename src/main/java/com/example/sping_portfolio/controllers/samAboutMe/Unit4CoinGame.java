package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit4CoinGame {
    private int startingCoins;
    private int maxRounds;

    public Unit4CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }

    public int getPlayer1Move(int round) {
        int p1Move;
        if (round % 2 == 0 || round == 1) {
            p1Move = 2;
        } else if (round % 3 == 0) {
            p1Move = 1;
        } else {
            p1Move = 3;
        }
        return p1Move;
    }


    public int getPlayer2Move(int round) {
        int p2Move;
        if (round % 3 == 0) {
            p2Move = 3;
        } else if (round % 2 == 0) {
            p2Move = 2;
        } else {
            p2Move = 1;
        }
        return p2Move;
    }

    public String playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        for (int i=1; i<=maxRounds; i++) {
            int player1Move = getPlayer1Move(i);
            int player2Move = getPlayer2Move(i);

            if(player1Move == player2Move) {
                player1Coins = player1Coins - player1Move;
                player2Coins = player2Coins - player2Move;
                player2Coins += 1;
            } else if(Math.abs(player1Move - player2Move) == 1) {
                player1Coins = player1Coins - player1Move;
                player2Coins = player2Coins - player2Move;
                player2Coins += 1;
            } else if(Math.abs(player1Move - player2Move) == 2) {
                player1Coins = player1Coins - player1Move;
                player2Coins = player2Coins - player2Move;
                player1Coins += 2;
            }
        }
        String result = "";
        if (player1Coins == player2Coins) {
            result="tie game";
        } else if (player1Coins > player2Coins) {
            result="player 1 wins";
        } else {
            result="player 2 wins";
        }
        return result;
    }

}
