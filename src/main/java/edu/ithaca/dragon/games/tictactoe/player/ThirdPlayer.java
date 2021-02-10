package edu.ithaca.dragon.games.tictactoe.player;

import java.util.*; 


//import org.graalvm.compiler.lir.gen.DiagnosticLIRGeneratorTool;
import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;


public class ThirdPlayer implements TicTacToePlayer {

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {

        System.out.println("Your Player's Symbol : " + yourSymbol);

        Pair<Integer, Integer> topLeft = new Pair<>(0,0);
        Pair<Integer, Integer> topMiddle = new Pair<>(1,0);
        Pair<Integer, Integer> topRight = new Pair<>(2,0);
        Pair<Integer, Integer> middleLeft = new Pair<>(0,1);
        Pair<Integer, Integer> middleMiddle = new Pair<>(1,1);
        Pair<Integer, Integer> middleRight = new Pair<>(2,1);
        Pair<Integer, Integer> bottomLeft = new Pair<>(0,2);
        Pair<Integer, Integer> bottomMiddle = new Pair<>(1,2);
        Pair<Integer, Integer> bottomRight = new Pair<>(2,2);

        List<Pair<Integer, Integer>> priorityMovesList= new ArrayList<>();

        priorityMovesList.add(topRight);
        priorityMovesList.add(topMiddle);
        priorityMovesList.add(middleMiddle);
        priorityMovesList.add(middleRight);
        priorityMovesList.add(topLeft);
        priorityMovesList.add(bottomLeft);
        priorityMovesList.add(bottomRight);

        for (int i = 0; i<=4; i++){
            Pair<Integer, Integer> nextMove = priorityMovesList.get(i);
            if (curBoard.isSquareOpen(nextMove)== true){
                return nextMove;
            }
        }
        return bottomRight;
    }

}

    
 


    
    



    

