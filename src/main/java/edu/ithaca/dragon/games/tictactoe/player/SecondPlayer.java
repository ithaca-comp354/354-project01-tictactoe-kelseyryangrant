package edu.ithaca.dragon.games.tictactoe.player;

import java.util.*; 


//import org.graalvm.compiler.lir.gen.DiagnosticLIRGeneratorTool;
import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;


public class SecondPlayer implements TicTacToePlayer {

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




        String currentBoardString = curBoard.buildSquaresString();
        // Creating array of string length 
        String[] ch = new String[currentBoardString.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < currentBoardString.length(); i++) { 
        
            ch[i] = Character.toString(currentBoardString.charAt(i)); 

        } 

        if (!(currentBoardString.contains("X")) && !(currentBoardString.contains("0"))){
            return topRight;
        }

        String stringChange = Character.toString(yourSymbol);

        String opponentSymbol = "fat yoshi";
        if(stringChange.equals("O")){
            opponentSymbol = "X";
        }
        else {
            opponentSymbol = "O";
        }

        if (ch[0].equals(opponentSymbol) && ch[1].equals(opponentSymbol)){
            return topRight;
        }
        else if (ch[0].equals(opponentSymbol) && ch[2].equals(opponentSymbol)){
            return topMiddle;
        }
        else if (ch[1].equals(opponentSymbol) && ch[2].equals(opponentSymbol)){
            return topRight;
        }
        else if (ch[3].equals(opponentSymbol) && ch[4].equals(opponentSymbol)){
            return middleRight;
        }
        else if (ch[4].equals(opponentSymbol) && ch[5].equals(opponentSymbol)){
            return middleLeft;
        }
        else if (ch[3].equals(opponentSymbol) && ch[5].equals(opponentSymbol)){
            return middleMiddle;
        }
        else if (ch[6].equals(opponentSymbol) && ch[7].equals(opponentSymbol)){
            return bottomRight;
        }
        else if (ch[7].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return bottomRight;
        }
        else if (ch[6].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return bottomMiddle;
        }
        else if (ch[0].equals(opponentSymbol) && ch[3].equals(opponentSymbol)){
            return bottomLeft;
        }
        else if (ch[3].equals(opponentSymbol) && ch[6].equals(opponentSymbol)){
            return topLeft;
        }
        else if (ch[0].equals(opponentSymbol) && ch[6].equals(opponentSymbol)){
            return middleLeft;
        }
        else if (ch[1].equals(opponentSymbol) && ch[4].equals(opponentSymbol)){
            return bottomMiddle;
        }
        else if (ch[4].equals(opponentSymbol) && ch[7].equals(opponentSymbol)){
            return topMiddle;
        }
        else if (ch[1].equals(opponentSymbol) && ch[7].equals(opponentSymbol)){
            return middleMiddle;
        }
        else if (ch[2].equals(opponentSymbol) && ch[5].equals(opponentSymbol)){
            return bottomRight;
        }
        else if (ch[5].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return topLeft;
        }
        else if (ch[2].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return middleLeft;
        }
        else if (ch[0].equals(opponentSymbol) && ch[4].equals(opponentSymbol)){
            return bottomRight;
        }
        else if (ch[0].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return middleMiddle;
        }
        else if (ch[4].equals(opponentSymbol) && ch[8].equals(opponentSymbol)){
            return topLeft;
        }
    
        else if (ch[6].equals(opponentSymbol) && ch[4].equals(opponentSymbol)){
            return topRight;
        }
        else if (ch[6].equals(opponentSymbol) && ch[2].equals(opponentSymbol)){
            return middleMiddle;
        }
        else if (ch[1].equals(opponentSymbol) && ch[2].equals(opponentSymbol)){
            return topRight;
        }

        List<Pair<Integer, Integer>> priorityMovesList= new ArrayList<>();

        priorityMovesList.add(topRight);
        priorityMovesList.add(topMiddle);
        priorityMovesList.add(middleMiddle);
        priorityMovesList.add(middleRight);
        priorityMovesList.add(topLeft);
        priorityMovesList.add(bottomLeft);
        priorityMovesList.add(bottomRight);
        priorityMovesList.add(middleLeft);
        priorityMovesList.add(bottomMiddle);

        for (int i = 0; i<=7; i++){
            Pair<Integer, Integer> nextMove = priorityMovesList.get(i);
            if (curBoard.isSquareOpen(nextMove)== true){
                return nextMove;
            }
        }

        throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());
    }
}

    
 


    
    


