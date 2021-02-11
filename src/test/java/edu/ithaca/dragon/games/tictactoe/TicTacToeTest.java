package edu.ithaca.dragon.games.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.games.tictactoe.player.BrainDeadPlayer;
import edu.ithaca.dragon.games.tictactoe.player.HumanPlayer;
//import edu.ithaca.dragon.games.tictactoe.player.NewPlayer;
import edu.ithaca.dragon.games.tictactoe.player.RuleBasedAgentKelsey;
//import edu.ithaca.dragon.games.tictactoe.player.ThirdPlayer;

public class TicTacToeTest {

    @Test
    public void brainDeadGameTest(){
        TicTacToeGame game = new TicTacToeGame(new RuleBasedAgentKelsey(), new HumanPlayer());
        while (game.calcGameStatus() == GameStatus.PLAYING){
            game.takeTurn();
        }
        String gameResult = game.makeBoardCopy().buildSquaresString();
        
        System.out.println(gameResult);
        //assertTrue("XOXOXOX  ".equals(gameResult) || "OXOXOXO  ".equals(gameResult));
    }
    
}
