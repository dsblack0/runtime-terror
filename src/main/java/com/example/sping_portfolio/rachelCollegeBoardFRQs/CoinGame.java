package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.sql.SQLOutput;

public class CoinGame {

    public static void main(String[] args) {
        startingCoins=10;
        maxRounds=5;
        System.out.println("Both players start with " + startingCoins + " coins.");
        System.out.println("Playing game with " + maxRounds + " rounds.");
        playGame();
    }

    private static int startingCoins; // starting number of coins
    private static int maxRounds; // maximum number of rounds played

    public CoinGame(int s, int r) {

        startingCoins = s;
        maxRounds = r;

    }

    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.*/
    public static int getPlayer1Move(int round) {

        int result1 = 0;

        if (round%2 == 0 || round==1) {
            result1 = 2;
        }
        if (round%3 == 0) {
            result1 = 1;
        }
        if (round%2 != 0 && round!=1 && round%3 != 0) {
            result1 = 3;
        }

        System.out.print("player 1 move:" + result1 + "; ");
        return result1;

    }

    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).*/

    public static int getPlayer2Move(int round) {

        int result2 = 0;

        if (round%3 == 0) {
            result2 = 3;
        }
        if (round%3 != 0 && round%2 == 0) {
            result2 = 2;
        }
        if (round%3 != 0 && round%2 != 0) {
            result2 = 1;
        }

        System.out.println("player 2 move:" + result2);
        return result2;

    }



    /** Plays a simulated game between two players, as described in part (b).

     */

    public static void playGame() {
        int p1coins = startingCoins;
        int p2coins= startingCoins;
        int p1played;
        int p2played;

        for (int i=1; i<=maxRounds; i++){
            p1played = getPlayer1Move(i);
            p2played = getPlayer2Move(i);
            p1coins-=p1played;
            p2coins-=p2played;
            if(p1played==p2played) {
                p2coins+=1;
            }
            if(Math.abs(p1played-p2played)==1) {
                p2coins+=1;
            }
            if(Math.abs(p1played-p2played)==2) {
                p1coins+=2;
            }

            System.out.println("round " + i + ": player 1 has " + p1coins + " coins remaining; " + "player 2 has " + p2coins + " coins remaining");
            System.out.println();

        }
        System.out.println("end of game");

        if(p1coins==p2coins) {
            System.out.println("Result: tie game");
        }
        if(p1coins>p2coins) {
          System.out.println("Result: player 1 wins");
        }
        if(p1coins<p2coins) {
          System.out.println("Result: player 2 wins");
        }

    }

}
