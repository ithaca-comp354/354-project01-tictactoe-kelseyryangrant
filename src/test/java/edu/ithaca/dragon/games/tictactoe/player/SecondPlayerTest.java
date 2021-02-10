package edu.ithaca.dragon.games.tictactoe.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.javatuples.Pair;
import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.games.tictactoe.board.TwoDArrayBoard;

public class SecondPlayerTest {

    @Test
    public void chooseSquareTest(){
        SecondPlayer player = new SecondPlayer();
        //0, nothing on board, choose top right corner
        assertEquals(new Pair<>(2,0), player.chooseSquare(new TwoDArrayBoard("         "), 'X'));
        //1
        assertEquals(new Pair<>(1, 0), player.chooseSquare(new TwoDArrayBoard("  X O    "), 'X'));
        //2
        assertEquals(new Pair<>(2, 1), player.chooseSquare(new TwoDArrayBoard(" XX O O  "), 'X'));
        //3
        assertEquals(new Pair<>(2, 2), player.chooseSquare(new TwoDArrayBoard("OXX O    "), 'X'));
        //4
        assertEquals(new Pair<>(1, 2), player.chooseSquare(new TwoDArrayBoard(" OX OX   "), 'X'));


        assertThrows(IllegalArgumentException.class, ()-> player.chooseSquare(new TwoDArrayBoard("OOXOOXXXX"), 'O'));
    }

    public void checkForThreeTest(){
        SecondPlayer player2 = new SecondPlayer();
        
    }
    
}
