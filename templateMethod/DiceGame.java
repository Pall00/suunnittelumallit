package templateMethod;

import java.util.Random;

public class DiceGame extends Game {

    //private int[] scores;
    private int winningPlayer;
    private int playedTimes;
    private Random random;
    private int maxScore;

    @Override
    void initializeGame() {
        random = new Random();
        maxScore = 0;
        }

    @Override
    void makePlay(int player) {
        int diceRoll = random.nextInt(6) + 1;
        playedTimes++;
        
        if (diceRoll > maxScore) {
            maxScore = diceRoll;
             winningPlayer = player + 1 ;
            }
        }

    @Override
    boolean endOfGame() {
        
       if(playedTimes == playersCount){
            return true;
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("Pelaaja numero " + winningPlayer + " voittaa luvulla " + maxScore);
        
    }
}

