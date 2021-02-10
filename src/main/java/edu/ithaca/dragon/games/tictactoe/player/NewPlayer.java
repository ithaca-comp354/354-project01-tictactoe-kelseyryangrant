package edu.ithaca.dragon.games.tictactoe.player;

import java.util.*; 


//import org.graalvm.compiler.lir.gen.DiagnosticLIRGeneratorTool;
import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;

public class NewPlayer implements TicTacToePlayer {

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {

        System.out.println("New Player's Symbol : " + yourSymbol);

        //row 1
        List<Pair<Integer, Integer>> SAR1 = new ArrayList<>();
        List<Pair<Integer, Integer>> row1 = new ArrayList<>();
        row1.add(new Pair<>(0,0));
        row1.add(new Pair<>(1,0));
        row1.add(new Pair<>(2,0));

        //row 2
        List<Pair<Integer, Integer>> SAR2 = new ArrayList<>();
        List<Pair<Integer, Integer>> row2 = new ArrayList<>();
        row2.add(new Pair<>(0,1));
        row2.add(new Pair<>(1,1));
        row2.add(new Pair<>(2,1));

        //row 3
        List<Pair<Integer, Integer>> SAR3 = new ArrayList<>();
        List<Pair<Integer, Integer>> row3 = new ArrayList<>();
        row3.add(new Pair<>(0,2));
        row3.add(new Pair<>(1,2));
        row3.add(new Pair<>(2,2));

        //column 1
        List<Pair<Integer, Integer>> SAC1= new ArrayList<>();
        List<Pair<Integer, Integer>> column1 = new ArrayList<>();
        column1.add(new Pair<>(0,0));
        column1.add(new Pair<>(0,1));
        column1.add(new Pair<>(0,2));

        //column 2
        List<Pair<Integer, Integer>> SAC2 = new ArrayList<>();
        List<Pair<Integer, Integer>> column2 = new ArrayList<>();
        column2.add(new Pair<>(1,0));
        column2.add(new Pair<>(1,1));
        column2.add(new Pair<>(1,2));

        //column 3
        List<Pair<Integer, Integer>> SAC3 = new ArrayList<>();
        List<Pair<Integer, Integer>> column3 = new ArrayList<>();
        column3.add(new Pair<>(2,0));
        column3.add(new Pair<>(2,1));
        column3.add(new Pair<>(2,2));

        //left to right diagnol
        List<Pair<Integer, Integer>> SAD1 = new ArrayList<>();
        List<Pair<Integer, Integer>> diagLtoR = new ArrayList<>();
        diagLtoR.add(new Pair<>(0,0));
        diagLtoR.add(new Pair<>(1,1));
        diagLtoR.add(new Pair<>(2,2));

        //right to left diagnol
        List<Pair<Integer, Integer>> SAD2 = new ArrayList<>();
        List<Pair<Integer, Integer>> diagRtoL = new ArrayList<>();
        diagRtoL.add(new Pair<>(0,2));
        diagRtoL.add(new Pair<>(1,1));
        diagRtoL.add(new Pair<>(2,0));

        //corner spaces
        List<Pair<Integer, Integer>> corners = new ArrayList<>();
        corners.add(new Pair<>(0,0));
        corners.add(new Pair<>(2,0));
        corners.add(new Pair<>(0,2));
        corners.add(new Pair<>(2,2));


        List<Pair<Integer, Integer>> availableSpaces = new ArrayList<>();

        System.out.println(curBoard.buildSquaresString());

        
        for (int i = 0; i<3; i++){
            Pair<Integer, Integer> pairToCheck = row1.get(i);
            if (curBoard.isSquareOpen(pairToCheck)== true){
                SAR1.add(pairToCheck);
                availableSpaces.add(pairToCheck);
            }

            Pair<Integer, Integer> pairToCheck2 = row2.get(i);
            if (curBoard.isSquareOpen(pairToCheck2) == true){
                SAR2.add(pairToCheck2);  
                availableSpaces.add(pairToCheck2);
            }

            Pair<Integer, Integer> pairToCheck3 = row3.get(i);
            if (curBoard.isSquareOpen(pairToCheck3) == true){
                SAR3.add(pairToCheck3);
                availableSpaces.add(pairToCheck3); 
            }

            Pair<Integer, Integer> pairToCheck4 = column1.get(i);
            if (curBoard.isSquareOpen(pairToCheck4) == true){
                SAC1.add(pairToCheck4);
                availableSpaces.add(pairToCheck4);
            }

            Pair<Integer, Integer> pairToCheck5 = column2.get(i);
            if (curBoard.isSquareOpen(pairToCheck5) == true){
                SAC2.add(pairToCheck5);
                availableSpaces.add(pairToCheck5);
            }

            Pair<Integer, Integer> pairToCheck6 = column3.get(i);
            if (curBoard.isSquareOpen(pairToCheck6) == true){
                SAC3.add(pairToCheck6);
                availableSpaces.add(pairToCheck6);
                
            }

            Pair<Integer, Integer> pairToCheck7 = diagLtoR.get(i);
            if (curBoard.isSquareOpen(pairToCheck7) == true){
                SAD1.add(pairToCheck7);
                availableSpaces.add(pairToCheck7);
            }

            Pair<Integer, Integer> pairToCheck8 = diagRtoL.get(i);
            if (curBoard.isSquareOpen(pairToCheck8) == true){
                SAD2.add(pairToCheck8);
                availableSpaces.add(pairToCheck8);
            }


        }

        if(SAR1.size() == 1){
            return SAR1.get(0);
        }
        if(SAR2.size() == 1){
            return SAR2.get(0);
        }
        if(SAR3.size() == 1){
            return SAR3.get(0);
        }
        if(SAC1.size() == 1){
            return SAC1.get(0);
        }
        if(SAC2.size() == 1){
            return SAC2.get(0);
        }
        if(SAC3.size() == 1){
            return SAC3.get(0);
        }
        if(SAD1.size() == 1){
            return SAD1.get(0);
        }
        if(SAD2.size() == 1){
            return SAD2.get(0);
        }
        
        for (int i = 0; i<=4; i++){
            Pair<Integer, Integer> cornerToCheck = corners.get(i);
            if (curBoard.isSquareOpen(cornerToCheck)== true){
                return cornerToCheck;
            }
            else{
                return availableSpaces.get(0);
            }

        

        }

        return availableSpaces.get(0);
       
        
    }
}
    
