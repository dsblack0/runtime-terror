package com.example.sping_portfolio.adritaCollegeboardFRQs;

public class unit4part2 {
    private int start;
    private int max;

    public unit4part2(int s, int r) {
        start = s;
        max = r;
    }

    public int getPlayer1Move(int round) {
        int p1Move = 0;
        if (round == 1 || round % 2 == 0) {
            p1Move = 2;
        } else if (round % 3 == 0) {
            p1Move = 1;
        } else {
            p1Move = 3;
        }
        return p1Move;
    }


    public int getPlayer2Move(int round) {
        int p2Move = 0;
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
        int player1Coins = start;
        int player2Coins = start;
        for (int i=1; i<=max; i++) {
            int player1Move = getPlayer1Move(i);
            int player2Move = getPlayer2Move(i);

            if(player1Move == player2Move || Math.abs(player1Move - player2Move) == 1 || Math.abs(player1Move - player2Move) == 2) {
                player1Coins = player1Coins - player1Move;
                player2Coins = player2Coins - player2Move;
                player2Coins += 1;
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
